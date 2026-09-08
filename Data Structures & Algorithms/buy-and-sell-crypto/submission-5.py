class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0 
        minBuy = prices[0] # buy on the first day to start off 

        for price in prices: 
            curP = price - minBuy 
            if curP > maxP:
                maxP = curP
            
            if price < minBuy:
                minBuy = price 
        
        return maxP

