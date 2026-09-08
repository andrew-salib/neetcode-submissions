class Solution {
    public int missingNumber(int[] nums) {
        // O(1) space solution 

        int maxSum = 0; 
        for (int i = 0; i <= nums.length; i++){
            maxSum += i;
        }

        int actualSum = 0;
        for (int n : nums) {
            actualSum += n;
        }

        return (maxSum - actualSum);
    }
}
