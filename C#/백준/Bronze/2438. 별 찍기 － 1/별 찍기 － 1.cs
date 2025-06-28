using System;
namespace ReadLine
{
    class Program
    {
        static void Main(String[] args)
        {

            int N = Convert.ToInt32(Console.ReadLine());
            for (int i = 1; i <=N; i++)
            {
                for (int j= 0; j < i; j++)
                {
                    Console.Write("*");
                
                }
                Console.WriteLine();
            }



        }
    }
}