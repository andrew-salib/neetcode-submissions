class Solution {
    public int firstUniqChar(String s) {
        int res = s.length(); 

        for (char c: s.toCharArray()) {
            int firstIndex = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c); 

            if (lastIndex == firstIndex) {
                res = Math.min(res, firstIndex);
            }
        }

        return res == s.length() ?  -1: res;
    }
}