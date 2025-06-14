using Antlr4.Runtime;

namespace Syscode
{
    public static class SyscodeExtensions
    {
        public static R4 GetNode<R, R1, R2, R3, R4>(this ParserRuleContext context)
             where R : ParserRuleContext
             where R1 : ParserRuleContext
             where R2 : ParserRuleContext
             where R3 : ParserRuleContext
             where R4 : ParserRuleContext
        {
            return context.GetNode<R>().GetNode<R1>().GetNode<R2>().GetNode<R3>().GetNode<R4>();
        }
        public static R3 GetNode<R, R1, R2, R3>(this ParserRuleContext context) where R : ParserRuleContext where R1 : ParserRuleContext where R2 : ParserRuleContext where R3 : ParserRuleContext
        {
            return context.GetNode<R>().GetNode<R1>().GetNode<R2>().GetNode<R3>();
        }
        public static R2 GetNode<R, R1, R2>(this ParserRuleContext context) where R : ParserRuleContext where R1 : ParserRuleContext where R2 : ParserRuleContext
        {
            return context.GetNode<R>().GetNode<R1>().GetNode<R2>();
        }
        public static R1 GetNode<R, R1>(this ParserRuleContext context) where R : ParserRuleContext where R1 : ParserRuleContext
        {
            return context.GetNode<R>().GetNode<R1>();
        }
        public static T GetNode<T>(this ParserRuleContext context) where T : ParserRuleContext
        {
            if (context.children == null)
                return null;

            var matches = context.children.Where(child => child.GetType() == typeof(T)).ToList();

            if (matches.Any() == false)
                return null;

            if (matches.Count() > 1)
                throw new InvalidOperationException("More than one matching child.");

            return (T)matches.Single();
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