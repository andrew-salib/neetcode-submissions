class Solution {
    public int[] replaceElements(int[] arr) {
        // going to create another array with the suffix match to be able to do this problem 

        int[] suffix = new int[arr.length]; 

        int rightMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            suffix[i] = rightMax;
            rightMax = Math.max(rightMax, arr[i]);
        }

        return suffix;
    }
}