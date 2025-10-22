using System;
namespace game_dev1
{
    class Program
    {
        static void Main(string[] args)
        {

            int[] numbers = new int[9];
            for (int i = 0; i < 9; i++)
            {
                numbers[i] = int.Parse(Console.ReadLine());
            }
            Console.WriteLine(numbers.Max());
            Console.WriteLine(Array.IndexOf(numbers,numbers.Max())+1);
        }
    }
}