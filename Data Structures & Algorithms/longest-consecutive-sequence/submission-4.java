class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 

        for (int n : nums) {
            set.add(n);
        }

        int length = 0; 
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            while(set.contains(nums[i] + length)) {
                length++;
                res = Math.max(res, length);
            }

            // reset length back to 1 when we dont find a consecutive --> start a new search
            length = 1;
        }

        return res;
    }
}
