class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] numbers = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++)
        {
            int product = 1; 
            int j = 0; 
            while (j < nums.length) {
                if (j != i)
                {
                    product *= nums[j];

                }
                j++; 
            }

            numbers[i] = product; 
        }

        return numbers; 

    }
}  
