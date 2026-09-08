class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); 

        for (int n : nums)
        {
            if(!map.containsKey(n))
            {
                map.put(n, 1);
            }
            else
            {
                map.put(n, map.get(n) + 1);
            }
        }

        for (int i = 2; i <= nums.length; i++)
        {
            if (map.containsValue(i))
            {
                return true;
            }
        }

        return false;
    }
}