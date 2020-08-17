public class Solution
{
    public string LongestCommonPrefix(string[] strs)
    {
        // assuming we only have 0 element in the array.
        if (strs.Length == 0)
        {
            return "";
        }

        // assuming we only have 1 element in the array.
        if (strs.Length == 1)
        {
            return strs[0];
        }

        int len = strs.Length;
        string compare = strs[0];

        for (int i = 1; i < len; i++)
        {
            compare = CompareStrings(compare, strs[i]);
        }

        return compare;

        /* 
        This is due to I didn't consider if I have different element numbers rather than 3.
        string a = strs[0];
        string b = strs[1];
        string c = strs[2];
        
        char[] aa = a.ToCharArray();
        char[] bb = b.ToCharArray();
        char[] cc = c.ToCharArray();
        
        string pre = "";
        
        int i = 0;
        while (aa[i]!=null && bb[i]!=null && cc[i]!=null)
        {
            if(aa[i]!=bb[i] || bb[i]!=cc[i] || aa[i] != cc[i])
            {
                break;
            }
            else
            {
                string s = Char.ToString(aa[i]);
                pre +=s;
                i++;
            }
        }
        
        return pre;
        */
    }

    public string CompareStrings(string a, string b)
    {
        Char[] aa = a.ToCharArray();
        Char[] bb = b.ToCharArray();

        string pre = "";
        int len = 0;

        if (aa.Length >= bb.Length)
        {
            len = bb.Length;
        }
        else
        {
            len = aa.Length;
        }

        for (int i = 0; i < len; i++)
        {
            if (aa[i] != bb[i])
            {
                break;
            }
            else
            {
                string s = Char.ToString(aa[i]);
                pre += s;
            }
        }

        return pre;

    }
}