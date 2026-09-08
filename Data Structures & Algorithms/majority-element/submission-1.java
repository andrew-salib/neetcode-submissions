class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(); // integer -> frequency 

        if (nums.length == 1) {
            return nums[0];
        }
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
                int count = map.get(n); 
                if (count > nums.length/2) {
                    return n;
                }
            } else {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            
        }

        return -1;
    }
}