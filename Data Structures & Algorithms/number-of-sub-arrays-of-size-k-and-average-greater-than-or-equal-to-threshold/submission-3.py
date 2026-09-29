class Solution:
    def numOfSubarrays(self, arr: List[int], k: int, threshold: int) -> int:
        count = 0 

        l = 0 
        current_sum = 0 

        # add the first k - 1 elements to our running sum 
        for i in range(0, k - 1):
            print(arr[i])
            current_sum += arr[i]
        
        

        # next number we add to our running sum will be the first sub-array to consider 

        for r in range(k - 1, len(arr)):
            current_sum += arr[r]

            if (r - l + 1 > k): 
                current_sum -= arr[l]
                l += 1
            
            avg = current_sum / k 

            if avg >= threshold: 
                count += 1
        
        return count
