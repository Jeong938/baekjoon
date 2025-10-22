using System;
namespace game_dev1
{
    class Program
    {
        static void Main(string[] args)
        {
            
            string[] a = Console.ReadLine().Split();
            int n = int.Parse(a[0]);
            int x = int.Parse(a[1]);
            // 정수 배열
            int [] numbers = Array.ConvertAll(Console.ReadLine().Split(),int.Parse);

            // 출력
            for(int i = 0; i <n; i++)
            {
                if (numbers[i]< x)
                {
                    Console.Write(numbers[i] + " ");
                }
            }

        }
    }
}