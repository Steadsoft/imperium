using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;


    public static class StringExtensions
    {
        public static StringBuilder append (this StringBuilder arg,string text)
        {
            return arg.Append (text);
        }

    public static String reverse(this StringBuilder arg)
    {
        return arg.ToString().ToCharArray().Reverse().ToString();
    }

    public static String toString(this StringBuilder arg)
    {
        return arg.ToString();
    }

}



