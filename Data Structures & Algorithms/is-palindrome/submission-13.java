class Solution {
    public boolean isPalindrome(String s) {
        int L = 0; 
        int R = s.length()- 1;
        
        while (L < R) {
            if (!isAlphaNum(s.charAt(L))) {
                L++;
                continue;
            }
            if (!isAlphaNum(s.charAt(R))) {
                R--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(R)) != Character.toLowerCase(s.charAt(L))) {
                return false;
            }
            L++;
            R--;
        }
        return true;
    }

    public boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' || 
                c >= '0' && c <= '9');
    }
}
