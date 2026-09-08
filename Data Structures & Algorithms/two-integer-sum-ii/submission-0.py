class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        i = 1 # pointer to track the index 
        for j in range(len(numbers)):
            difference = target - numbers[j]
            if difference in numbers and numbers.index(difference) > j:
                return [j + 1, numbers.index(difference) + 1] 