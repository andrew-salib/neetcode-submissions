class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>(); 

        Arrays.sort(nums); 

        for (int k = 0; k < nums.length; k++)
        {
            if (nums[k] > 0) break; 
            if (k > 0 && nums[k] == nums[k-1]) continue;

            int l = k + 1; 
            int r = nums.length - 1; 

            while (l < r)
            {
                if (nums[l] + nums[r] == (-1 * nums[k]))
                {
                    res.add(Arrays.asList(nums[k], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l-1])
                    {
                        l++; 
                    }
                }
                else if (nums[l] + nums[r] < (-1 * nums[k]))
                {
                    l++;
                }
                else
                {
                    r--; 
                }
            }
        }

        return res;
    }
}
