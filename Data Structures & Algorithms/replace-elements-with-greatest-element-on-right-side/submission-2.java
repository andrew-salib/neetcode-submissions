class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        res[arr.length - 1] = -1;
        int max = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            max = Math.max(max, arr[i]);
            res[i-1] = max; 
        }

        return res;
    }
}