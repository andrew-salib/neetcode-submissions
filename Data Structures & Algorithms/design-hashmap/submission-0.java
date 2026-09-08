class MyHashMap {
    private List<List<Integer>> list;
    public MyHashMap() {
        list = new ArrayList<>(); 
    }
    
    public void put(int key, int value) {
        List<Integer> isFound = search(key); 
        if (isFound != null) {
            isFound.set(1, value);
            return; 
        }

        List<Integer> temp = new ArrayList<>();
        temp.add(key);
        temp.add(value);
        list.add(temp);
    }
    
    public int get(int key) {
        List<Integer> isFound = search(key);
        if (isFound != null) {
            return isFound.get(1);
        }
        return -1; 
    }
    
    public void remove(int key) {
       List<Integer> isFound = search(key);
        if (isFound != null) {
            list.remove(isFound); 
        }

        System.out.print(list);
    }

    public List<Integer> search(int key) {
        for (List<Integer> lists: list) {
            if (lists.get(0) == key) {
                return lists;
            }

        }

        return null; 
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */