class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        # use a hashmap for each string to store the characters (keys) and their frequency (values) 
        # use a for-loop to iterate through each string, if we encounter a character we already seen, increase freqency by 1 
        # else, if its not already in the dictionary, add it and set the value to be 1 

        # finally, check that dictionaryS = dictionaryT 

        if len(s) != len(t):
            return False 
        
        dictS = {}
        dictT = {}

        for i in range(len(s)):
            if s[i] not in dictS: 
                dictS[s[i]] = 1
            else: 
                dictS[s[i]] = dictS[s[i]] + 1
        


        for i in range(len(t)):
            if t[i] not in dictT: 
                dictT[t[i]] = 1
            else: 
                dictT[t[i]] = dictT[t[i]] + 1

        return dictS == dictT

    