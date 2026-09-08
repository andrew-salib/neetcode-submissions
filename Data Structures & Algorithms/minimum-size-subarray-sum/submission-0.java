class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int L = 0; 
        int sum = 0; 
        int length = Integer.MAX_VALUE; 
        
        for (int R = 0; R < nums.length; R++)
        {
            sum += nums[R];
           while (sum >= target)
           {
                length = Math.min(length, R - L + 1); 
                sum -= nums[L];
                L++;
           }
        }
        
        if (length == Integer.MAX_VALUE)
        {
            return 0; 
        }
        
        return length;
       
    }
    
}