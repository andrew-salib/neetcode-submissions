class Solution {
    public int climbStairs(int n) {
      int[] cache = new int[9999];
      return climbStairCase(n, cache);


    }

    public int climbStairCase(int n, int[] cache) {
      if (n <= 2) return n; 

      if (cache[n] != 0) {
        return cache[n];
      }

      cache[n] = climbStairCase(n-1, cache) + climbStairCase(n-2, cache);
      return cache[n];


    }


}
