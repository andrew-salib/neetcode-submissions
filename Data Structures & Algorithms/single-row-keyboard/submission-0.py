class Solution:
    def calculateTime(self, keyboard: str, word: str) -> int:
        total = 0 
        prev_index = 0 

        for c in word: 
            index = keyboard.index(c)
            total += abs(prev_index - index)
            prev_index = index
        
        return total 
    