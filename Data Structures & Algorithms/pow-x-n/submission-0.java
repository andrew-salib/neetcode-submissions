class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1; 
        }
        
        double res = 1; 
        if ( n < 0) {
            double outcome = raise(x,-n,res);
            return 1 / outcome; 
        }
        
        return raise(x, n, res);
    }

    public double raise(double x, int n, double res) {
        if (n == 0) {
            return res; 
        }

        res = res * x;
        return raise(x, n - 1, res);
    }

    
}
