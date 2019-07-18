class Solution {
    public int[] twoSum(int[] nums, int target) {
        int A;
        int B;
        int[] result=new int[2];
        for (A=0;A<nums.length;A++){
            for(B=A+1;B<nums.length;B++){
                if (nums[A]+nums[B] ==target) {
                    result = new int[] {A, B};
                    return result;
                }
                
            }
        }
        return result;
    }
}


// the following is use the HashMap to solve the 2 sum issue.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int A;
        int B;
        int[] result=new int[2];
        HashMap<Integer, Integer> hash= new HashMap<Integer,Integer>();
        for (A=0;A<nums.length;A++){
            hash.put(A, nums[A]);
            }
        // here, I accidently implement the HashMap containsKey method.
        for (Integer id:hash.keySet()){
            for(B=id+1;B<hash.size();B++) {
                if (hash.get(id)+hash.get(B) == target){
                    result = new int[] {id, B};
                    return result;
                }
            }         
        }
        return result;
    }
}

// the third version is using the containsKey() to achieve. But it will failed at [3,3 ]

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int A;
        int B;
        int[] result=new int[2];
        HashMap<Integer, Integer> hash= new HashMap<Integer,Integer>();
        for (A=0;A<nums.length;A++){
            hash.put(nums[A],A); //Due to we need the index, so we put the index as value, much eaiser to get.
            }
        for (Integer id:hash.keySet()){
            int pair = target - id;
            if (hash.containsKey(pair)&& hash.get(pair)!=hash.get(id)){
                result = new int[] {hash.get(id),hash.get(pair)};
                return result;
                // or return new int[] {hash.get(id),hash.get(pair)};
                }
            }   
        return result;
        }
}

// using the array to loop

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int A;
        int B;
        int[] result=new int[2];
        HashMap<Integer, Integer> hash= new HashMap<Integer,Integer>();
        for (A=0;A<nums.length;A++){
            hash.put(nums[A],A); //Due to we need the index, so we put the index as value, much eaiser to get.
            }
        for (int i=0; i <nums.length;i++){ //use the array lenth to loop
            int pair = target - nums[i];
            if (hash.containsKey(pair)&& hash.get(pair)!=i){
                result = new int[] {i,hash.get(pair)};
                return result;
                // or return new int[] {hash.get(id),hash.get(pair)};
                }
            }   
        return result;
        }
}