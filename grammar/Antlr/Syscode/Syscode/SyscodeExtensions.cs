using Antlr4.Runtime;

namespace Syscode
{
    public static class SyscodeExtensions
    {
        public static T GetNode<T>(this ParserRuleContext context, RuleType RuleType) where T : ParserRuleContext
        {
            if (RuleType == RuleType.Required)
            {
                if (context == null)
                    throw new InvalidOperationException("Node must not be null");

                if (context.children == null)
                    throw new InvalidOperationException("Expected child node is not present.");

                var matches = context.children.Where(child => child.GetType() == typeof(T)).ToList();

                if (matches.Any() == false)
                    throw new InvalidOperationException("Expected child node is not present.");

                if (matches.Count() > 1)
                    throw new InvalidOperationException("More than one matching child node is present.");

                return (T)matches.Single();
            }
            else
            {
                if (context == null)
                    return null;

                if (context.children == null)
                    return null;

                var matches = context.children.Where(child => child.GetType() == typeof(T)).ToList();

                if (matches.Any() == false)
                    return null;

                if (matches.Count() > 1)
                    throw new InvalidOperationException("More than one matching child node is present.");

                return (T)matches.Single();
            }

        }
        public static bool HasNode<T>(this ParserRuleContext context) where T : ParserRuleContext
        {
            if (context.children == null)
                return false;

            var matches = context.children.Where(child => child.GetType() == typeof(T)).ToList();

            if (matches.Any() == false)
                return false;

            if (matches.Count() > 1)
                throw new InvalidOperationException("More than one matching child.");

            return true;
        }
        public static List<T> GetNodes<T>(this ParserRuleContext context) where T : ParserRuleContext
        {
            if (context.children == null)
                return new List<T>(); ;

            var matches = context.children.Where(child => child.GetType() == typeof(T)).Cast<T>().ToList();

            if (matches.Any() == false)
                return new List<T>();

            return matches;
        }
        public static string GetLabelText(this ParserRuleContext context, string Label)
        {
            return ((ParserRuleContext)(context.GetType().GetField(Label).GetValue(context))).GetText();
        }

    }
}