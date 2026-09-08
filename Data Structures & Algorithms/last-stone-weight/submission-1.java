class Solution {
    List<Integer> heap = new ArrayList<>();
    public int lastStoneWeight(int[] stones) {
       
       PriorityQueue<Integer> minHeap = new PriorityQueue<>(); 
        for (int s: stones) {
            // negative is used to turn it into max heap since it now becomes the smallest negative nuimber. 
            minHeap.offer(-s); 
        }

        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll(); 

            if (second != first) {
                minHeap.offer(first - second); 
            }
        }

        // need to add 0 to the min heap for the order property 
        return minHeap.isEmpty() ? 0 : -1*minHeap.peek(); 
    }

    
}
