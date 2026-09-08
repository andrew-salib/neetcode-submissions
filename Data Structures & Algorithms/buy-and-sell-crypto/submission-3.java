class Solution {
    public int maxProfit(int[] prices) {
       int L = 0;  
       int maxP = 0; 
       int r = 1; 

       while (r < prices.length) {
            if (prices[r] > prices[L]) {
                maxP = Math.max(maxP, prices[r] - prices[L]);
            }
            else {
                L = r; 
            }
            r++;
       }

       return maxP;
    }
}
