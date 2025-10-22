using System;
namespace game_dev1
{
    class Program
    {
        static void Main(string[] args)
        {
            int n = int.Parse(Console.ReadLine());
            // 정수 배열
            int [] numbers = Array.ConvertAll(Console.ReadLine().Split(),int.Parse);
            int max = numbers[0];
            int min = numbers[0];
            // 출력
            for (int i = 0; i < n; i++)
            {
                if (numbers[i] > max)
                {
                    max = numbers[i];
                }

                if (numbers[i] < min)
                {
                    min = numbers[i];
                }
            }

            // int max = numbers.Max();
            // int min = numbers.Min();

            Console.Write(min + " " + max);

        }
    }
}