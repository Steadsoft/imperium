namespace A
{
    namespace B
    {

    }

    public class C
    {
        public C() { }
    }
}

public struct S
{
    public S() { }
}

namespace ConsoleApp2
{
    public class state
    {
        public int next_stmt = 0;
        public bool done = false;
    }
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            int s = 5;
            int m = 20;

            foreach (var z in numbers(s, m))
            {
                Console.WriteLine(z);

                m = 10;
            }

            state cs = new state();

            int x;

            x = coroutine(cs);

            x = coroutine(cs);
            x = coroutine(cs);
            x = coroutine(cs);



        }


        private static IEnumerable<int> numbers(int start, int max)
        {
            while (start < max)
            {
                yield return start++;
            }
        }

        private static int coroutine(state s)
        {
            try
            {
                switch (s.next_stmt)
                {
                    case (0):
                        return 10;
                    case (1):
                        return 11;
                    case (2):
                        return 12;
                    case (3):
                        return 13;
                    case (4):
                        return 14;
                    default: s.done= true;
                        return 0;

                }

            }
            finally
            {
                s.next_stmt++;
            }
        }
    }
}