class Solution {
    public int romanToInt(String s) {
        int[] num = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 1 };
        String[] rome = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            String m;
            while (s.indexOf(rome[i]) != -1) {
                m = s.subString(s.indexOf(rome[i]) + rome[i].length());
                sum = sum + num[i];
            }
        }
        return sum;
    }
}

// above is trying to get echa number. which we have to use the iterator.

class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> table = new HashMap<String, Integer>();
        int sum = 0;
        table.put("M", 1000);
        table.put("D", 500);
        table.put("C", 100);
        table.put("L", 50);
        table.put("X", 10);
        table.put("V", 5);
        table.put("I", 1);

        sum = table.get(String.valueOf(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            // like CM, C lower that M, means we need use M minors C, and C already added,so
            // minors C again.
            // 先取得字符，再转成字符串，然后从hashmap里拿到对应的值
            if (table.get(String.valueOf(s.charAt(i - 1))) < table.get(String.valueOf(s.charAt(i)))) {
                sum = sum + table.get(String.valueOf(s.charAt(i))) - 2 * table.get(String.valueOf(s.charAt(i - 1)));
            } else {
                sum = sum + table.get(String.valueOf(s.charAt(i)));
            }
        }
        return sum;
    }
}
