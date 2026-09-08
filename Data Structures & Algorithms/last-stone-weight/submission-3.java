class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>(); 
        for (int s : stones) {
            list.add(s); 
        }

        while (list.size() > 1) {
            Collections.sort(list);

            int difference = (list.remove(list.size() - 1) - list.remove(list.size() - 1));
            if (difference != 0) {
                list.add(difference);
            } 
        }

        return list.isEmpty() ? 0 : list.get(0);
    }
}
