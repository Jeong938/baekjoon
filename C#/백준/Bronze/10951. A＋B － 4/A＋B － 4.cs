using System;
namespace ReadLine
{
    class Program
    {
        static void Main(String[] args)
        {
            
            while (true)
            {
                 String num = Console.ReadLine();
                 if (num == null) break;
                 String[] arr = num.Split();
                Console.WriteLine(Int32.Parse(arr[0]) + Int32.Parse(arr[1]));
            }



        }
    }
}