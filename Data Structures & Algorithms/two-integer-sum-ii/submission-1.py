class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        
        for j in range(len(numbers)):
            difference = target - numbers[j]
            if difference in numbers and numbers.index(difference) > j:
                return [j + 1, numbers.index(difference) + 1] 


            '''
            proper 2 - pointer approach here: 
            
            # using a pointer to start from the beginning and from end 
            # they move towards the middle 
            l, r = 0 , len(numbers) - 1

            while l < r:
                curSum = numbers[l] + numbers[r]
                # make use of the fact that they are already sorted 
                # to know that if we are above target, simply move right pointer 
                if curSum > target: 
                    r -= 1
                elif curSum < target: 
                    l += 1
                else: 
                    return [l + 1, r + 1]
            '''