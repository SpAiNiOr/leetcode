using System;

namespace Sort
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("This is for sorting algrithim");

            int[] arr = new int[] { 3, 2, 5, 6, 7, 8, };
            Console.WriteLine($"The sample list is following");
            print(arr);

            Console.WriteLine("The first one is Bubble Sorting");

            Bubble bubble = new Bubble();

            print(bubble.BubbleSorting(arr));
            // Console.ReadLine();


            //Select sort

            Console.WriteLine("The Second one is Select Sorting");
            int[] arr2 = new int[] { 3, 2, 5, 6, 7, 8, };
            Select sel = new Select();
            print(sel.SelectSorting(arr2));
            Console.ReadLine();

        }

        //abstract print element in the array.
        static void print(int[] arr)
        {
            foreach (int n in arr)
            {
                Console.Write(n);
                Console.Write(" ");
            }

            Console.WriteLine("/n");
        }
    }
}
