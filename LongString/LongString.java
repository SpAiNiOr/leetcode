import java.lang.System;

public class LongString{

    public LongString() {

    }

    public int lengthOfLongestSubstring(String s) {
        int longstring = 1;
        int slenth = s.length();    
        String bigest="";
        if (s.length()>1){
            bigest= s.substring(0,1);
        }
        else if(s.length()==1){
            bigest = s;
            return 1;
        }
        else if(s.length()==0){
            return 0;
        }
                
            
        String compare;
                
        for (int i =0; i< slenth;i++){
            for (int j = i+1; j<slenth;j++){
                char temp = s.charAt(j);
                compare = s.substring(i,j);
                if (compare.indexOf(temp)>=0){
                    break;
                }
                else if (compare.length() >= longstring) {
                    bigest = s.substring(i,j+1);
                    longstring = bigest.length();
                }
            }
        }
        System.out.println(bigest);
        return longstring;
    }

    public static void main(String[] args) {
        LongString lstring = new LongString();

        String targetString = "aabb";

        lstring.lengthOfLongestSubstring(targetString);
        
    
        
    }





}