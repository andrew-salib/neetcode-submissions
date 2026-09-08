class Solution {
    public int maxProfit(int[] prices) {
        int l = prices[0]; 
        int profit = 0; 

        for (int r = 0; r < prices.length; r++) {
            if (prices[r] < l) {
                l = prices[r]; 
            }

            profit = Math.max(profit, prices[r] - l);
        }

        return profit;
    }
}
