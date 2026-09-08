class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        
        # need to get a list of values without duplicates --> use a set 

        mySet = set() 

        for num in nums: 
            mySet.add(num)

        res = [] 

        for i in range(1, len(nums) + 1):
            if i not in mySet:
                res.append(i)
        
        return res