using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System.Text.Json;
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

        private static Dictionary<string, Dictionary<string, string>> language_dictionary = new();

        static void Main(string[] args)
        {
            //ImperiumLexer.keywords = JsonSerializer.Deserialize<Dictionary<string, Dictionary<string, string>>>(File.ReadAllText(@"..\..\..\..\..\Antlr\lingua.keywords")).ToDictionary(x => x.Key, x => x.Value.ToDictionary(x => x.Value, x => x.Key));

            //
            //TextReader source = File.OpenText(@"..\..\..\..\..\Antlr\test1.nr");

            var regex = new Regex(PLI_INCLUDE_REGEX);

            //TextReader source = ReadFile(@"test_3.nr");

            NestedSourceReader reader = new NestedSourceReader("parser_test.fr.ipl", regex, ReadFile);

            AntlrInputStream inputStream = new AntlrInputStream(reader);
            ImperiumLexer imperium_lexer = new ImperiumLexer(inputStream);

            imperium_lexer.KeywordLanguageCode = "fr";

            CommonTokenStream commonTokenStream = new CommonTokenStream(imperium_lexer);
            ImperiumParser imperium_parser = new ImperiumParser(commonTokenStream);

            imperium_parser.BuildParseTree = true;

            var tree = imperium_parser.translation_unit();

            //var listener = new TestListener();

            //var visitior = new ImperiumBaseVisitor<int>();

            //visitior.VisitTranslation_unit(tree);

            ParseTreeWalker walker = new ParseTreeWalker();

           // walker.Walk(listener, tree);

            Console.WriteLine(tree.ToStringTree());
        }

        private static TextReader? ReadFile (string Filename, Regex Regex)
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

}