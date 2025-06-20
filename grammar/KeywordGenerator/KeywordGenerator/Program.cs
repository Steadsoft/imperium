﻿using System.Reflection.Metadata;
using System.Runtime.InteropServices;
using System.Text;
using System.Text.Json;


namespace KeywordGenerator
{


    internal class Program
    {
        private static int longest;

        static void Main(string[] args)
        {

            int outer;

            if (args.Length > 0)
            {
                int inner;

                if (args[0] != null)
                {
                    int deeper;

                    // do stuff
                }
            }



            string single_language = null;

            // load the dictionary.

            if (args != null)
                single_language = args[0];

            var inpath = Path.GetFullPath(@"..\..\..\..\..\antlr\imperium.keywords.json");
            var outpath = Path.GetFullPath(@"..\..\..\..\..\antlr\ImperiumKeywords.txt");

            JsonSerializerOptions options = new JsonSerializerOptions() { ReadCommentHandling = JsonCommentHandling.Skip };

            var language_dictionary = JsonSerializer.Deserialize<Dictionary<string, Dictionary<string, string>>>(File.ReadAllText(inpath), options);

            if (single_language!= null)
            {
                foreach ( var key in language_dictionary.Keys )
                {
                    if (key != single_language)
                        language_dictionary.Remove(key);
                }
            }


            var expected_num_entries = language_dictionary["en"].Count();
            var num_languages = language_dictionary.Keys.Count();

            var longest_keyword = language_dictionary["en"].Keys.Select(k => k.Length).Max() + 1; // get length of longest key to help us create a uniformly spaced layout of Antlr terms.

            Console.WriteLine($"Language 'en' contains {expected_num_entries} entries.");

            foreach (var dict in language_dictionary.Where(ld => ld.Key != "en"))
            {
                if (dict.Value.Count() < expected_num_entries)
                    Console.WriteLine($"Language '{dict.Key}' contains too few entries ({dict.Value.Count()}).");

                if (dict.Value.Count() > expected_num_entries)
                    Console.WriteLine($"Language '{dict.Key}' contains too many entries ({dict.Value.Count()}).");

                if (dict.Value.Count() == expected_num_entries)
                    Console.WriteLine($"Language '{dict.Key}' contains the correct number of entries ({expected_num_entries}).");


            }

            // ensure each language has unique keywords, do not allow the same terms to appear in several definitions for any given language

            bool dupes_present = false;

            foreach (var language in language_dictionary.OrderBy(e => e.Key))
            {
                var dupes = language.Value.Values.SelectMany(s => s.Split(',')).Select(s => s.Trim()).GroupBy(s => s).Where(g => g.Count() > 1);

                if (dupes.Any())
                {
                    foreach (var dupe in dupes)
                    {
                        Console.WriteLine($"The language '{language.Key}' contains mulitple uses of the target keyword '{dupe.Key}'");
                    }

                    dupes_present = true;
                }
            }

            // get the length of the longest keyword across all lexicons, we use to the develop a uniform padding for the generated output.

            longest = 4 + language_dictionary.Values.SelectMany(v => v.Values).SelectMany(v => v.Split(',')).Select(keyword => keyword.Trim().Length).Max();

            if ( dupes_present )
            {
                Console.WriteLine("Keyword file creation aborted.");
                return;
            }

            Dictionary<string,string> output = new Dictionary<string,string>();

            string padder = " ".PadRight(longest_keyword);

            foreach (var language in language_dictionary.OrderBy(e => e.Key))
            {
                foreach (var keyword_pair in language_dictionary[language.Key])
                {
                    if (!output.ContainsKey(keyword_pair.Key))
                    {
                        output[keyword_pair.Key] = $"{keyword_pair.Key.ToUpper() + ":"} {Environment.NewLine}{padder}[Lexicon(!{language.Key}!)]? {ExtractMultiples(keyword_pair.Value)} | ".Replace('[','{').Replace(']', '}').Replace('!', '"') + Environment.NewLine;
                    }
                    else
                    {
                        output[keyword_pair.Key] = output[keyword_pair.Key] + $"{padder}[Lexicon(!{language.Key}!)]? {ExtractMultiples(keyword_pair.Value)} | ".Replace('[','{').Replace(']', '}').Replace('!', '"') + Environment.NewLine;
                    }
                }
            }

            foreach (var entry in output)
            {
                output[entry.Key] = entry.Value.TrimEnd('\n').TrimEnd('\r').TrimEnd(' ').TrimEnd('|') + ";";            
            }


            var file = File.CreateText(outpath);

            file.WriteLine(PaddedComment("", 100, '-'));
            file.WriteLine(PaddedComment($"These Antlr4 keyword token definitions were generated by a utility on {DateTime.Now.ToShortDateString()} at {DateTime.Now.ToShortTimeString()}", 100, ' '));
            file.WriteLine(PaddedComment($"Input:  {inpath}", 100, ' '));
            file.WriteLine(PaddedComment($"Output: {outpath}", 100, ' '));
            file.WriteLine(PaddedComment("", 100, ' '));
            file.WriteLine(PaddedComment($"Number of languages {num_languages}.",100,' '));
            file.WriteLine(PaddedComment($"Expected number of keywords per language {expected_num_entries}.", 100, ' '));
            file.WriteLine(PaddedComment("", 100, '-'));
            file.WriteLine();

            file.WriteLine("identifier: (");

            var keywords = language_dictionary["en"].Keys.OrderBy(k => k);

            file.WriteLine($"    {keywords.First().Trim().ToUpper()}");

            foreach (var keyword in keywords.Skip(1))
            {
                file.WriteLine($"  | {keyword.Trim().ToUpper()}");
            }

            file.WriteLine("  )");
            file.WriteLine("  | IDENTIFIER");
            file.WriteLine("  ;");
            file.WriteLine();

            foreach (var kv in output.OrderBy(kv => kv.Key.ToUpper()))
            {
                file.WriteLine(kv.Value);
            }

            file.WriteLine() ;

            file.WriteLine(PaddedComment("End of generated Antlr4 keyword token definitions.", 0,' '));

            file.Close(); ;
        }

        private static string PaddedComment(string Text, int Len, char Padder)
        {
            var full = Text.PadRight(Len, Padder);

            return ($"/* {full} */");
        }

        // If a keyword def include a full and an abbreviation or alias, pull them out here
        private static string ExtractMultiples(string input)
        {

            if (input.Contains(',') == false)
                return $"('{input}')".PadRight(longest+1);

            StringBuilder builder = new StringBuilder();

            var parts = input.Split(',');

            foreach (var part in parts)
            {
                var text = $"'{part.TrimStart().TrimEnd()}'";

                builder.Append($"{text.PadRight(longest)} | ");
            }

            return $"({builder.ToString().Trim().Trim('|').Trim()})";

        }
    }
}