using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System.Text.RegularExpressions;
using static System.Net.Mime.MediaTypeNames;

namespace AntlrCSharp
{
    internal class Program
    {
        private static string text =
            $@"call = 1234{Environment.NewLine}ball = 1234{Environment.NewLine}";
        private static string C_INCLUDE_REGEX = @"\#include\s*(<([^""<>|\b]+)>|""([^""<>|\b]+)"")";
        private static string PLI_INCLUDE_REGEX = @"% *include +(<([^'<>|\b]+)>|'([^'<>|\b]+)')";
        static void Main(string[] args)
        {
            //
            //TextReader source = File.OpenText(@"..\..\..\..\..\Antlr\test1.nr");

            if (true & false)
                ;

            if (true && false)
                ;

            var regex = new Regex(PLI_INCLUDE_REGEX);

            //TextReader source = ReadFile(@"test_3.nr");

            NestedSourceReader reader = new NestedSourceReader("test_3.nr", regex, ReadFile);

            AntlrInputStream inputStream = new AntlrInputStream(reader);
            PostLexer noresLexer = new PostLexer(inputStream);

            noresLexer.langcode = "en"; // set as needed.

            CommonTokenStream commonTokenStream = new CommonTokenStream(noresLexer);
            PostParser noresParser = new PostParser(commonTokenStream);

            noresParser.BuildParseTree = true;

            var tree = noresParser.translation_unit();

            var listener = new TestListener();

            var visitior = new PostBaseVisitor<int>();

            visitior.VisitTranslation_unit(tree);

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.Walk(listener, tree);

            Console.WriteLine(tree.ToStringTree());

            await x;
        }

        private static TextReader ReadFile (string Filename, Regex Regex)
        {
            if (Regex.IsMatch(Filename))
            {
                var filename = Filename.Replace("%", "").Replace("include", "").Replace(";", "").Trim().TrimEnd('\'').TrimStart('\'');

                var extras = Filename.Replace("%","").Replace("include","").Replace(";","").Replace("'","").Replace(filename, "").Trim();

                if (extras.Length > 0)
                    return null;

                return File.OpenText($@"..\..\..\..\..\Antlr\{filename}");
            }
            else
            {
                return File.OpenText($@"..\..\..\..\..\Antlr\{Filename}");
            }
        }

    }

    public class await
    {

    }

}