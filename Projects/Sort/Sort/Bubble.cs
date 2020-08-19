using System;
using System.Collections.Generic;
using System.Text;

namespace Sort
{
    class Bubble
    {
        public Bubble()
        { }

        //This is C# bubble sorting algrithm.
        public int[] BubbleSorting(int[] arr)
        {
            int temp;
            for (int i =0; i<arr.Length-1; i++)
            {
                for (int j = 0; j<arr.Length - 1 -i; j++)
                {
                    if (arr[j]>arr[j+1])
                    {
                        temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                        
                    }

                }
            }

            return arr;
        }
        

    }
}
