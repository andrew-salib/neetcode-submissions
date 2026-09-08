class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // fixed sliding window problem. 
        HashSet<Integer> set = new HashSet<>(); 

        int L = 0; 
        for (int R = 0; R < nums.length; R++)
        {
            if (R - L > k)
            {
                set.remove(nums[L]);
                L++;
            }
            if (set.contains(nums[R])) return true;
            set.add(nums[R]);
        }
        return false;
    }
}