using System;

namespace game_dev1
{
    class Program
    {
        static void Main(string[] args)
        {
            char[,] chars = new char[5, 15];
            int[] lengths = new int[5]; // 각 줄의 실제 길이를 저장

            for (int i = 0; i < 5; i++)
            {
                string line = Console.ReadLine();
                lengths[i] = line.Length;

                for (int j = 0; j < line.Length; j++)
                {
                    chars[i, j] = line[j];
                }
            }

            for (int j = 0; j < 15; j++)
            {
                for (int i = 0; i < 5; i++)
                {
                    if (j < lengths[i]) // 그 줄에 j번째 문자가 존재할 때만 출력
                        Console.Write(chars[i, j]);
                }
            }
        }
    }
}
