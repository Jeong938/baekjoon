using System;
namespace ReadLine
{
    class Program
    {
        static void Main(String[] args)
        {

            int N = Convert.ToInt32(Console.ReadLine());
            N = N / 4;
            for (int i = 0; i < N; i++)
            {
                Console.Write("long ");
            }
            Console.Write("int");

            
        }
    }
}