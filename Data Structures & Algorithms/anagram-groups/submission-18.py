class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # loop through each word in the array 
        # sort it to get the "key" of the dict 
        # if the key already exists, then append the original word to the sublist as the value(s) 
        # if it is not in the array, start a new sublist with the original word as the first item 

        wordHash = {}

        for word in strs: 
            sorted_word = ''.join(sorted(word))

            if sorted_word not in wordHash: 
                wordHash[sorted_word] = [word]
            else:
                wordHash[sorted_word].append(word)
        
        return list(wordHash.values())
