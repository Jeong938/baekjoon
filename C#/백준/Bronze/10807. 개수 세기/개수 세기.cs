using System;
namespace game_dev1
{
    class Program
    {
        static void Main(string[] args)
        {
            // 정수의 개수
            int n = int.Parse(Console.ReadLine());  

            // 정수 배열
            string [] numbers = Console.ReadLine().Split();

            // 찾으려는 정수
            string v = Console.ReadLine();

            int count = 0;
            // 찾기
            for(int i = 0; i < n; i++)
            {
                if (v == numbers[i])
                {
                    count++;
                }
            }

            Console.WriteLine(count);
        }
    }
}