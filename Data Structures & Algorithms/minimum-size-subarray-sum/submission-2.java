class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE; 
        int l = 0; 
        int curSum = 0; 
        
        for (int r = 0; r < nums.length; r++) {
            curSum += nums[r]; 

            while (curSum >= target) {
                curSum -= nums[l];
                minSize = Math.min(minSize, r - l + 1);
                l++;
                 
            
            }

            
        }
        
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }
}