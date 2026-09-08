class Solution {
    public int findDuplicate(int[] nums) {
        int[] seen = new int[nums.length + 1];
        for (int n : nums) {
            seen[n]++;
        }

        for (int i = 0; i < seen.length; i++) {
            if (seen[i] > 1) {
                return i;
            }
        }

        return -1;
    }
}
