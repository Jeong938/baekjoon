using System;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;

namespace game_dev1
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            int[] numbers = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
            int max = numbers.Max();
            double sum = 0;

            for (int i = 0; i < n; i++)
            {
                sum += ((double)numbers[i] / max) * 100;
            }
            
            Console.WriteLine(sum / n);
        }
    }
}
