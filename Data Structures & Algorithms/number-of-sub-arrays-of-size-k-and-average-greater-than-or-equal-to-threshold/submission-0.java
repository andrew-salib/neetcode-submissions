class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0; 
        int res = 0; 
        int curSum = 0; 

        for (int r = 0; r < arr.length; r++) {
            
            curSum += arr[r];
            
            if (r - l + 1 == k) {
                int avg = curSum / k; 
                curSum -= arr[l];
                l++;
                if (avg >= threshold) {
                    res++;
                }
            }

            
        }

        return res;
    }
}