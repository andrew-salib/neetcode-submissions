class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        
        int L = 0; 
        while (L < s.length()) {
            HashSet<Character> set = new HashSet<>();
            int r = L; 
            int curLength = 0; 
            while (r < s.length() && !set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                curLength++;
                r++;
            }

            maxLength = Math.max(maxLength, curLength);
            L++;
            

        }
        return maxLength;
    }
}
