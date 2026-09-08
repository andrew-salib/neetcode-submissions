class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0 
        minBuy = prices[0] # buy on the first day to start off 

        for price in prices: 
            maxP = max(maxP, price - minBuy)
            minBuy = min(minBuy, price)
        
        return maxP 
