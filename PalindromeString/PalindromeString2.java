import java.lang.System;
import java.util.HashMap;

public class PalindromeString2 {

    public PalindromeString2() {

    }

    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }

        /*
         * Checking when string has move than 2 chars. The idea is to compare char in
         * the string, the first with last, if not the same, means it's not Palindrome/
         * Then check next substring.
         * 
         */

        String temp;
        String result = s.substring(0, 1);
        int strLength = 2;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                temp = s.substring(i, j + 1);
                if (checkPalindrome(temp) && temp.length() >= strLength) {
                    result = temp;
                    strLength = temp.length();
                }

            }
        }

        return result;
    }

    public boolean checkPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
                // break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeString2 check = new PalindromeString2();
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        check.longestPalindrome(s);

    }

}