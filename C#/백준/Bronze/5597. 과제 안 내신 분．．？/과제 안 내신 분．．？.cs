using System;

namespace game_dev1
{
    class Program
    {
        static void Main(string[] args)
        {
            Boolean[] booleans = new Boolean[30];
            
            
            for (int i = 0; i < 28; i++)
            {
                int num = int.Parse(Console.ReadLine());
                booleans[num-1] = true;
            }

            
            for (int i = 1; i <= 30; i++)
            {
                if (!booleans[i-1])
                {
                    Console.WriteLine(i);
                }
            }
        }
    }
}
