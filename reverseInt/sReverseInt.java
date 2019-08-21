class Solution {
    public int reverse(int x) {
        
        // I'm thinking change a int to Hashmap to do it. then remove the last one, and added into new hashmap.
        // then change hashmap to the int.

        HashMap<Integer, Integer> originalNum = new HashMap<Integer, Integer>();
        
        int temp;
        if (x>0){
            temp = x;
        } else {
            temp = Math.abs(x);
        }
        
        int i=0;
        while (temp/10>= 0) {
            originalNum.put(i,temp%10);
            i++;
            temp = temp/10;
        }
        
        
        //originalNum = originalNum.reverse();
        
        int j=originalNum.size()-1;
        
        while(originalNum.get(j)==0){
            originalNum.remove(j);
            j--;
        }
        
        double result =0;
        
        HashMap<Integer, Integer> newNum = new HashMap<Integer, Integer>();

        for (int m= originalNum.size() -1;m>0; m--){
            int y =0;
            newNum.put(y, originalNum.get(m));
   
            //
            y++;
        
        }
            
        for (int z =0;z<newNum.size();z++) {
            result += Math.pow(10,originalNum.size()-z) * newNum.get(z);
        }
                       
        int finalResult = (int) result;
        if (x>0) {
            return finalResult;
        } else {
            return 0-finalResult;
        }
    }
}