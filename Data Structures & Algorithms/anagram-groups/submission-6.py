class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        myHash = {}

        for word in strs: 
            sorted_word = ''.join(sorted(word))
            
            if sorted_word in myHash:
                myHash[sorted_word].append(word)
            else:
                myHash[sorted_word] = [word]

        return list(myHash.values())