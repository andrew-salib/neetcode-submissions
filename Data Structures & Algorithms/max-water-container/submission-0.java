class Solution {
    public int maxArea(int[] heights) {
        int L = 0; 
        int R = heights.length - 1;

        int max = 0; 
        
        while (L < R) {
            int water = (R-L) * Math.min(heights[L], heights[R]);
            max = Math.max(water, max);

            if (heights[L] <= heights[R]) {
                L++;
            }
            else {
                R--;
            }
        }

        return max;
    }
}
