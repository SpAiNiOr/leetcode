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