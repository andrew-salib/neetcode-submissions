class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # lets first get a dictionary that has the numbers and their frequencies. 

        myDict = {}

        for num in nums: 
            if num not in myDict: 
                myDict[num] = 1 
            else: 
                myDict[num] += 1
        

        # need to get the sorted values in a list in reverse-order 

        sorted_dict = sorted(myDict.items(), key=lambda x: x[1], reverse=True)
        res = []
        sorted_values = list(sorted_dict)
        
        for i in range(k):
            res.append(sorted_values[i][0])
        
        return res
        
        

       
            