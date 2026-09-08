class Solution:
    # function that sorts a string in order to make it easy to compare 
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # going to need two pointers again, one to go through the list and then one 
        # to add up the list of lists. 

        newList = {}

        l = 0
        for word in strs:
            sorted_word = ''.join(sorted(word))
            print(sorted_word)
            if sorted_word in newList:
                newList[sorted_word].append(word)
            else:
                newList[sorted_word] = [word]

        return newList.values()            
            

                
            
    


    # function that sorts a string in order to make it easy to compare 

    

        