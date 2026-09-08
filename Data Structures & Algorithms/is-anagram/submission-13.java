class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length())
        {
            return false; 
        }
        
        HashMap<Character, Integer> hashS = new HashMap<>(); // letter: frequency 
        HashMap<Character, Integer> hashT = new HashMap<>(); 

        for (int i = 0; i < s.length(); i++)
        {
            // string.charAt(i) to get the char at a specific index in the string 
            hashS.put(s.charAt(i), hashS.getOrDefault(s.charAt(i), 0) + 1); 
            hashT.put(t.charAt(i), hashT.getOrDefault(t.charAt(i), 0) + 1); 

        }

        // compare the frequency of the keys in both hashSets 
        return hashS.equals(hashT);
        
        



    }
}
