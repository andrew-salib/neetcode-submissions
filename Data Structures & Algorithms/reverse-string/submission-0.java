class Solution {
    public void reverseString(char[] s) {
        int L = 0;
        int R = s.length - 1;

        while (L < R) {
            char temp = s[R];
            s[R] = s[L];
            s[L] = temp;

            L++;
            R--; 
        }

        
    }
}