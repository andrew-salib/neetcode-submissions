class Solution {
    public double myPow(double x, int n) {
        if ( n == 0) {
            return 1; 
        }

        double res = 1;
        if (n < 0) {
            while (-n > 0) {
                res *= x; 
                n++;
            }

            return 1 / res; 
        }
        else if ( n > 0) {
            while (n > 0) {
                res *= x; 
                n--;
            }
            return res;
        }
        return res;
    }
}
