class Solution {
    public boolean isAnagram(String s, String t) {
        // create a hashMap with char and int for the character in the string and the number of times it appears 
        if (s.length() != t.length())
        {
            return false; 
        }

        Map<Character, Integer> mapS = new HashMap<>(); 
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
        {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        } 

        return mapS.equals(mapT);

    }
}
