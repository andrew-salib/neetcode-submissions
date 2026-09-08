class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        for (int l = 0; l < temperatures.length; l++) {
            int minDays = Integer.MAX_VALUE;
            for (int r = l; r < temperatures.length; r++) {
                if (temperatures[r] > temperatures[l]) {
                    minDays = Math.min(minDays, r - l);
                }
            }

            if (minDays == Integer.MAX_VALUE) {
                res[l] = 0;
            } else {
                res[l] = minDays; 
            }
            
        }

        return res;
    }
}
