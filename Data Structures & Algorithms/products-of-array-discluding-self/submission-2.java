class Solution {
    private int[] res; 
    public int[] productExceptSelf(int[] nums) {
        // brute force solution first
        res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            productResults(nums, i);
        }

        return res;
    }

    public void productResults(int[] nums, int index) {

        int j = index; // j becomes the index we want to skip 
       

        int product = 1; 
        for (int i = 0; i < nums.length; i++) {
            if (i != j) {
                product *= nums[i];
                
            }

        }

        res[j] = product; 
    }
}  
