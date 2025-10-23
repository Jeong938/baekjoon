using System;

namespace game_dev1
{
    class Program
    {
        static void Main(string[] args)
        {
            int[,] numbers = new int[9, 9];
            int max = int.MinValue;
            int ni = 0, nj = 0;

            for (int i = 0; i < 9; i++)
            {
                string[] inputs = Console.ReadLine().Split();
                for (int j = 0; j < 9; j++)
                {
                    numbers[i, j] = int.Parse(inputs[j]);

                    if (numbers[i, j] > max)
                    {
                        max = numbers[i, j];
                        ni = i;
                        nj = j;
                    }
                }
            }


            Console.WriteLine(max);
            Console.WriteLine($"{ni + 1} {nj + 1}");
        }
    }
}
