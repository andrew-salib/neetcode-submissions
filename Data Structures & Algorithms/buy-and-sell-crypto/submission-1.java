class Solution {
    public int maxProfit(int[] prices) {
        // we want the difference between the smallest and largest elements in the array 
        int buying = prices[0]; 
        int profit = 0; 

        for (int sell : prices)
        {
            profit = Math.max(profit, sell - buying);
            buying = Math.min(buying, sell);
        }

        return profit; 
    }
}
