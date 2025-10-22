using System;
using System.Collections.Generic;

namespace game_dev1
{
    class Program
    {
        static void Main(string[] args)
        {
            HashSet<int> remainders = new HashSet<int>();  // 나머지를 저장할 Set

            for (int i = 0; i < 10; i++)
            {
                int num = int.Parse(Console.ReadLine());
                remainders.Add(num % 42);  // 나머지 값을 Set에 추가 (중복 자동 제거)
            }

            // 서로 다른 나머지의 개수 출력
            Console.WriteLine(remainders.Count);
        }
    }
}
