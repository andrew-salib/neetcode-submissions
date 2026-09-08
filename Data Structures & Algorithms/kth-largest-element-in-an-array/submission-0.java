class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>(); 

        for (int n : nums) {
            list.add(n); 
        }

        Collections.sort(list);
        return list.isEmpty() ? -1 : list.get(list.size() - k);
    }
}
