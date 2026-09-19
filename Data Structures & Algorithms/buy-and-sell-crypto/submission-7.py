class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        maxp = 0
        minBuy = prices[0]
 

        for i in range(len(prices)):
            minBuy = min(minBuy, prices[i])
            maxp = max(maxp, prices[i] - minBuy)
        
        return maxp