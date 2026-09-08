class Solution {
    public int findLucky(int[] arr) {
        // trying a frequency arr solution for O(1) space 

        int[] res = new int[501]; 

        for (int n : arr) {
            res[n]++;
        }

        int maxLucky = -1;
        for (int n : arr) {
            if (res[n] == n) {
                maxLucky = Math.max(maxLucky, n);
            }
        }

        return maxLucky;
    }
}