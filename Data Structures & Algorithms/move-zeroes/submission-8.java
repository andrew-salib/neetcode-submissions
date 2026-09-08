class Solution {
    public void moveZeroes(int[] nums) {
        // simpler solution using 2 pointers: 
        int L = 0; 
        for (int R = 0; R < nums.length; R++) {
            if (nums[R] != 0) {
                int temp = nums[L];
                nums[L] = nums[R];
                nums[R] = temp;
                L++;
            }
        }
    }
}