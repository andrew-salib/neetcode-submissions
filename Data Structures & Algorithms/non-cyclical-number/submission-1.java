class Solution {
    HashSet<Integer> set; 
    public boolean isHappy(int n) {
        set = new HashSet<>(); 

       return recursion(n, set);


    }

    public boolean recursion(int n, HashSet<Integer> set) {
        
        if (n == 1) {
            return true;
        }

        if (set.contains(n)) {
            return false; 
        }

        set.add(n);

        int sum = 0; 
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n = n / 10;  
        }

        return recursion(sum, set);
    }
}