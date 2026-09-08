class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> mySet = new HashSet<>(); 

        int length = 0; 
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            while (mySet.contains(s.charAt(r)))
            {
                mySet.remove(s.charAt(l));
                l++;

            }

            mySet.add(s.charAt(r));
            length = Math.max(length, r - l + 1);
        }

        return length;
    }
}
