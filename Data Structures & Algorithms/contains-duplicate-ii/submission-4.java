class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // uses a rolling hashSet since we care about frequency / duplicate, within a range = sliding window also 

        HashSet<Integer> set = new HashSet<>(); 

        int l = 0; 
        for (int r = 0; r < nums.length; r++) {
            if (r - l > k) {
                set.remove(nums[l]);
                l++;
            }

            if (set.contains(nums[r])) {
                return true;
            }

            set.add(nums[r]);
        }

        return false;
    }
}