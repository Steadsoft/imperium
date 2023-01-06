using System.Text.Json;

namespace KeywordGenerator
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // load the dictionary.

            var language_dictionary = JsonSerializer.Deserialize<Dictionary<string, Dictionary<string, string>>>(File.ReadAllText(@"..\..\..\..\..\antlr\imperium.keywords.json"));//.ToDictionary(x => x.Key, x => x.Value.ToDictionary(x => x.Value, x => x.Key));

            Dictionary<string,string> output = new Dictionary<string,string>();

            foreach (var language in language_dictionary)
            {
                foreach (var keyword_pair in language_dictionary[language.Key])
                {
                    if (!output.ContainsKey(keyword_pair.Key))
                    {
                        output[keyword_pair.Key] = $"{keyword_pair.Key.ToUpper()}: [langcode==!{language.Key}!]? ('{keyword_pair.Value}') | ".Replace('[','{').Replace(']', '}').Replace('!', '"');
                    }
                    else
                    {
                        output[keyword_pair.Key] = output[keyword_pair.Key] + $"[langcode==!{language.Key}!]? ('{keyword_pair.Value}') | ".Replace('[','{').Replace(']', '}').Replace('!', '"');
                    }
                }
            }

            foreach (var entry in output)
            {
                output[entry.Key] = entry.Value.Trim(' ').Trim('|') + ";";            
            }


        }
    }
}