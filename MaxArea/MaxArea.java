class Solution {
    public int maxArea(int[] height) {
        int temp, result = 0;
        for (int i = 0; i < (height.length - 1); i++) {
            for (int j = 1; j <= (height.length - 1); j++) {
                int low = j - i;
                int high = (height[i] <= height[j]) ? height[i] : height[j];
                temp = low * high;
                result = (result >= temp) ? result : temp;
            }
        }
        return result;
    }
}