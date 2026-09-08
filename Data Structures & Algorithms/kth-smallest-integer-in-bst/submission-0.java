/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    private List<Integer> list; 
    public int kthSmallest(TreeNode root, int k) {
        list = new ArrayList<>(); 

        dfs(list, root);
        int index = k - 1; // to get the kth smallest 
        return list.get(index);

    }

    private void dfs(List<Integer> list, TreeNode root) {
        // implement a inorder traversal 

        if (root == null) {
            return; 
        }

        dfs(list, root.left);
        list.add(root.val);
        dfs(list, root.right);
    }
    
}
