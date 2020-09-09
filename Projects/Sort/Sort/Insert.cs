using System;
using System.Collections.Generic;
using System.Text;

namespace Sort
{
    class Insert
    {
        public Insert()
        { }

        public int[] InsertSorting(int[] arr)
        {
            for (int i =1; i<arr.Length; i++)
            {
                int pre = i - 1;
                int current = arr[i];

                //Because we can see from I is sorted list. so, we can set the pre < current will stop.
                while (pre >= 0 && arr[pre] > current)
                {
                    arr[pre + 1] = arr[pre];                   
                    pre--;
                }
                arr[pre + 1] = current;
            }

            return arr;
        }
    }
}
