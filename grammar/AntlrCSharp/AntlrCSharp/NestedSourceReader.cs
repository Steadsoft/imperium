using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace AntlrCSharp
{
    public  class NestedSourceReader : TextReader
    {
        private string sourceFile;
        private Func<string, Regex, TextReader> fileReader;
        private Regex regex;
        public NestedSourceReader(string SourceFile, Regex IncludePattern,Func<string,Regex,TextReader> FileReader)
        {
            fileReader = FileReader;
            sourceFile= SourceFile;
            regex = IncludePattern;
        }
        public override string ReadToEnd()
        {
            StringBuilder builder = new StringBuilder();

            append_stream(sourceFile, builder);

            var txt =  builder.ToString();

            return txt;

            /* Internal recursive method. */

            bool append_stream(string SourceFile, StringBuilder Builder)
            {
                var rdr = fileReader(SourceFile,regex);

                if (rdr == null)
                    return(false);

                var line = rdr.ReadLine();

                while (line != null)
                {
                    if (regex.IsMatch(line))
                    {
                        if (append_stream(line, builder) == false)
                            builder.Append(line);
                    }
                    else
                    {
                        builder.AppendLine(line);
                    }

                    line = rdr.ReadLine();
                }

                return true;

            }

        }
    }
}
