class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x == 0) {
            return true;
        }

        int count = 0;
        int demo = x;
        while (demo > 0) {
            demo = demo / 10; // I have changed the x. So in the end, the x is 0.
            count++;
        }

        System.out.println(count);

        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();
        for (int i = 0; i < count; i++) {
            int temp = x % 10;
            num.put(i, temp);
            x = x / 10;
        }
        for (int j = 0, k = (count - 1); j <= k; j++, k--) {
            System.out.println(num.get(j));
            System.out.println(num.get(k));
            if (num.get(j) == num.get(k)) {
                continue;
            } else {
                return false;
            }
        }
        /*
         * if (count%2==0){ for(int j=0;j<(count/2); j++){ if (num.get(j)!=
         * num.get(count-1-j)){ return false; }else { return true; } }
         * 
         * } else{ for (int k=0;k<(count/2);k++) { if (num.get(k)!= num.get(count-1-k)){
         * return false; }else { return true; } } }
         */
        return true;

    }
}