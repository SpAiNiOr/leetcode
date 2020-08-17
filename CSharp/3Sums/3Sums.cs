public class Solution
{

    //Seems this plan can work, but out of the time limition. Need change the plan.
    public IList<IList<int>> ThreeSum(int[] nums)
    {
        //please notice here how we declear the element
        IList<IList<int>> solutions = new List<IList<int>>();

        //if nums is empty array. return []
        if (nums.Length < 3)
        {
            return solutions;
        }

        //if all elements are 0. return [0, 0, 0];
        int count = 0;
        foreach (int n in nums)
        {
            if (n == 0)
            {
                count++;
            }
            else
            {
                break;
            }
        }

        if (count == nums.Length && nums.Length > 2)
        {
            IList<int> temp = new List<int> { 0, 0, 0 };
            solutions.Add(temp);
            return solutions;
        }

        //find out all possible combination.
        for (int i = 0; i < nums.Length - 2; i++)
        {
            for (int j = i + 1; j < nums.Length - 1; j++)
            {
                for (int k = j + 1; k < nums.Length; k++)
                {
                    if (nums[i] + nums[j] + nums[k] == 0)
                    {
                        //notice how we declear the element
                        List<int> temp = new List<int> { nums[i], nums[j], nums[k] };
                        Console.WriteLine("{0} {1} {2}", nums[i], nums[j], nums[k]);
                        solutions.Add(temp);
                    }
                }
            }
        }

        //delete the List that contains the same element.

        List<int> l = new List<int>();
        for (int m = 0; m < solutions.Count - 1; m++)
        {
            for (int n = m + 1; n < solutions.Count; n++)
            {
                bool isEqual = Enumerable.SequenceEqual(solutions[m].OrderBy(x => x), solutions[n].OrderBy(x => x));
                Console.WriteLine(isEqual);
                if (Enumerable.SequenceEqual(solutions[m].OrderBy(x => x), solutions[n].OrderBy(x => x)))
                //if(solutions[m].OrderBy(x => x).SequenceEqual(solutions[n].OrderBy(x => x)))
                {
                    l.Add(n);
                }
            }
        }

        IList<IList<int>> dup = new List<IList<int>>();

        foreach (int n in l)
        {
            dup.Add(solutions[n]);
        }

        foreach (List<int> n in dup)
        {
            solutions.Remove(n);
        }
        return solutions;
    }
}