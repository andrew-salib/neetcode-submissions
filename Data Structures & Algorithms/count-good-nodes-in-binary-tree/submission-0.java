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
    public int goodNodes(TreeNode root) {
        int res = 0; 
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>(); 

        q.offer(new Pair<>(root,  Integer.MIN_VALUE));

        // implment bfs algo, checking if the previous val in the branch was bigger or not. 

        while (!q.isEmpty()) {
            Pair<TreeNode, Integer> pair = q.poll(); 
            TreeNode node = pair.getKey();
            int prevVal = pair.getValue(); 

            if (node.val >= prevVal) {
                res++; 
            }

            if (node.left != null) {
                q.offer(new Pair<>(node.left, Math.max(prevVal, node.val)));
            }

            if (node.right != null) {
                q.offer(new Pair<>(node.right, Math.max(prevVal, node.val)));
            }
        }

        return res;
    }
}
