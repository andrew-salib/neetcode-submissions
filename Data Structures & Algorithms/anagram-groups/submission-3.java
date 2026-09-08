class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // sorting --> use a hashMap to group the anagrams together after sorting to determine if they are 
        // anagrams in the first place 

        Map<String, List<String>> res = new HashMap(); 

        for (String s : strs) {
            char[] charArray = s.toCharArray(); 
            Arrays.sort(charArray); 
            String sortedS = new String(charArray); 

            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s); 
        }
    
        return new ArrayList<>(res.values()); 
    }
}
