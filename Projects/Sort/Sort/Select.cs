using System;
using System.Collections.Generic;
using System.Text;

namespace Sort
{
    class Select
    {
        public Select()
        { }

        public int[] SelectSorting(int[] arr)
        {
            for (int i =0; i< arr.Length-1; i++)
            {
                int index = i;
                for (int j=i+1; j<arr.Length; j++)
                {
                    
                    if (arr[index]>arr[j])
                    {
                        index = j;
                    }
                }

                int tmp = arr[i];
                arr[i] = arr[index];
                arr[index] = tmp;
            }

            return arr;
        }
    }
}
