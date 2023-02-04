using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System.Diagnostics.CodeAnalysis;
using static ImperiumParser;

namespace AntlrCSharp
{
    public static class AstSupport
    {
        public static string GetSpelling(IdentifierContext C)
        {
            return C.GetText();
        }

        public static bool Has<T>(Func<T> ContextFunc, out T Context) where T : VisitorContext
        {
            Context = ContextFunc();
            return Context != null;
        }

        public static bool Has<T>(Func<T[]> ContextFunc, out T[] Context) where T : VisitorContext
        {
            Context = ContextFunc();
            return Context != null;
        }


        public static bool Has<T>(Func<T> ContextFunc) where T : ITerminalNode
        {
            var Context = ContextFunc();
            return Context != null;
        }

        public static bool exists<T>([NotNullWhen(true)] T? o) where T : class
        {
            return o != null;
        }

    }
}
