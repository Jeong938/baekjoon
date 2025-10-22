using System;
namespace game_dev1
{
    class Program
    {
        static void Main(string[] args)
        {
            string[] NM = Console.ReadLine().Split();
            int n = int.Parse(NM[0]);
            int m = int.Parse(NM[1]);
            int[] numbers = new int[n];

            for(int i = 0; i < n; i++)
            {
                numbers[i] = 0;
            }

            for (int i = 0; i < m; i++)
            {
                int[] ijk = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
                int start = ijk[0];
                int end = ijk[1];
                int ball = ijk[2];
                for(int j = start; j <=end; j++)
                {
                    numbers[j-1] = ball;
                }
            }
            Console.WriteLine(string.Join(" ",numbers));
        }
    }
}