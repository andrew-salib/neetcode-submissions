class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0; 
        int length = 0; 
        HashSet<Character> set = new HashSet<>(); 

        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
               
                l++;
            }

            length = Math.max(length, r-l + 1); 

            set.add(s.charAt(r)); 

            
        }

        return length;
    }
}
