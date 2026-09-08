class Solution {
    public void moveZeroes(int[] nums) {
        int L = 0;
    

        // move L to the first zero position in nums 
        while (nums[L] != 0 && L < nums.length - 1) {
           L++;
        }

        int R = L+ 1;

        while (R < nums.length) {
            if (nums[R] != 0) {
                nums[L] = nums[R];
                nums[R] = 0; 
                L++;
            }
            R++;
        }
    }
}