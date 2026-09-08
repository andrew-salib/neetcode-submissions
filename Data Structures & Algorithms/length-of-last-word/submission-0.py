class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        words = s.strip(); 
        wordsList = words.split() 

        return len(wordsList[-1])
        
        