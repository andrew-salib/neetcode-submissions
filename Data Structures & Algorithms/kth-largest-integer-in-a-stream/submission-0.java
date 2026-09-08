class KthLargest {
    private int k;
    private int[] nums; 
    private List<Integer> list; 
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums; 
        list = new ArrayList<>(); 
        for (int n : nums) {
            list.add(n);
        }
    }
     
    public int add(int val) {
        list.add(val); 

        Collections.sort(list);

        return list.get(list.size() - k);
    }
}
