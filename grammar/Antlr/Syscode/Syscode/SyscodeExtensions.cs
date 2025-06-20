using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

namespace Syscode
{
    public static class SyscodeExtensions
    {
        public static bool HasToken(this ParserRuleContext context, int tokenType)
        {
            if (context.children.Where(c => c is TerminalNodeImpl).Where(t => ((TerminalNodeImpl)(t)).Symbol.Type == tokenType).Count() == 1)
            {
                return true;
            }

            return false;
        }
        public static T GetTerminal<T>(this ParserRuleContext context) where T : TerminalNodeImpl
        {
            return (T)context.children.Where(child => child is T).Single();
        }
        public static T GetNode<T>(this ParserRuleContext context) where T : ParserRuleContext
        {
            if (context == null)
                throw new ArgumentNullException("context");

            if (context.children == null)
                throw new InvalidOperationException("Expected child node is not present.");

            var matches = context.children.Where(child => child is T).ToList();

            if (matches.Any() == false)
                throw new InvalidOperationException("Expected child node is not present.");

            if (matches.Count() > 1)
                throw new InvalidOperationException("More than one matching child node is present.");

            return (T)matches.Single();
        }
        public static bool TryGetNode<T>(this ParserRuleContext context, out T node) where T : ParserRuleContext
        {
            node = null;

            if (context == null)
                return false;

            if (context.children == null)
                return false;

            var matches = context.children.Where(child => child.GetType() == typeof(T)).ToList();

            if (matches.Any() == false)
                return false;

            if (matches.Count() > 1)
                throw new InvalidOperationException("More than one matching child node is present.");

            node = (T)matches.Single();

            return true;

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
        public static List<ParserRuleContext> GetChildren(this ParserRuleContext context, HashSet<Type> excludes)
        {
            if (context.children == null)
                return new List<ParserRuleContext>();

            return context.children.Where(c => (c is ParserRuleContext) && !excludes.Contains(c.GetType())).Cast<ParserRuleContext>().ToList();
        }
    }
}