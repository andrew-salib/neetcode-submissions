class Solution {
    public int maxProfit(int[] prices) {
        // we want the difference between the smallest and largest elements in the array 
        int buying = prices[0]; 
        int profit = 0; 

        for (int sell : prices)
        {
            if (sell - buying > profit)
            {
                profit = sell - buying;
            }

            if (sell < buying)
            {
                buying = sell;
            }
        }

        return profit; 
    }
}
