import java.util.*;

public class PalindromeString {

    public PalindromeString() {

    }

    public String longestPalindrome(String s) {
        HashMap<Integer, String> stringMap = new HashMap<Integer, String>();
        String[] str = s.split("|");

        for (int i = 0; i < s.length(); i++) {
            stringMap.put(i, str[i]);
            System.out.println("k:" + i + " v:" + str[i]);
        }

        String result = "";

        if (s.length() == 0) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }

        if (s.length() == 2) {
            if (stringMap.get(0).equals(stringMap.get(1))) {
                return result = stringMap.get(0) + stringMap.get(1);
            } else {
                return result = stringMap.get(0);
            }
        }

        int strLength = 2;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (checkPalindrome(stringMap, i, j) && (j - i + 1) >= strLength) {
                    strLength = j - i + 1;
                    result = "";
                    if (strLength == length) {
                        return s;
                    } else {
                        for (int x = i; x <= j; x++) {
                            result += stringMap.get(x);
                        }

                    }
                }

            }
        }
        System.out.println("The final result is " + result);

        if (result.equals("")) {
            return result = stringMap.get(0);
        } else {
            return result;
        }

    }

    public boolean checkPalindrome(HashMap<Integer, String> s, int i, int j) {
        for (int x = i, y = j; x < j; x++, y--) {
            System.out.println("x: " + s.get(x) + " y: " + s.get(y));
            if (!s.get(x).equals(s.get(y))) {
                System.out.println("false");

                return false;
                // break;
            }
        }
        System.out.println("ture");
        return true;
    }

    public static void main(String[] args) {
        PalindromeString pString = new PalindromeString();
        HashMap<Integer, String> sMap = new HashMap<Integer, String>();
        sMap.put(0, "b");
        sMap.put(1, "a");
        sMap.put(2, "b");
        sMap.put(3, "a");
        sMap.put(4, "d");
        String s = "nnnmn";
        // pString.checkPalindrome(sMap, 0, 2);
        pString.longestPalindrome(s);

    }
}