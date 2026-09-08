class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>(); 

        int max = 0; 
        int L = 0; 
        for (int R = 0; R < s.length(); R++) {
            while (set.contains(s.charAt(R))) {
                set.remove(s.charAt(L));
                L++;
            }

            max = Math.max(max, R - L + 1);
            set.add(s.charAt(R));
        }

        return max;
    }
}
