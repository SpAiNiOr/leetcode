class Solution {
    public String intToRoman(int num) {
        int []price = new int []{1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []rome = new String []{"M","CM", "D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result = "";
        
        for(int i =0;i<price.length;i++){
            int rep = num/price[i];
            num = num%price[i];
            for (int j=0; j<rep;j++){
                result = result + rome[i];
            }
            // result = result + rome[i].repeat(rep); java 11 contains str.repeat(n) method
        }
        return result;
        
    }
}