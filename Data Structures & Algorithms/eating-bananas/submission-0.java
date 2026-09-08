class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int L = 1; 
        int R = 0; 
        
        for (int n : piles) {
            R = Math.max(R, n); 
        }

     
        int answer = 0; 
        while (L <= R) {
            int middle = L  + (R - L) / 2; 
            long hours = 0; 
            
            for (int n : piles) {
                hours += (n + middle - 1) / middle; // ceil of pile / mid
            }

            if (hours > h) {
                // we are too slow increase the eating speed
                L = middle + 1; 
            }
            else if (hours <= h) {
                // we are valid, try a slower speed
                answer = middle; 
                R = middle - 1; 
            }
        }

        return answer;
    }
}
