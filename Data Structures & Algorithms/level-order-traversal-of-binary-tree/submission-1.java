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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // step 1 make a dequeue --> double ended queue to store the nodes one each level 
        Deque<TreeNode> queue = new ArrayDeque<>(); 

        // create a nested list for the question 
        List<List<Integer>> list = new ArrayList<>(); 
        
        // add the root to the queue 
        if (root != null) {
            queue.add(root);
            
        }
        
        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            List<Integer> currList = new ArrayList<>();
            for (int i = 0; i < levelLength; i++) {
                TreeNode curr = queue.removeFirst(); 
                currList.add(curr.val);

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }

            }
            list.add(currList);
        }

        return list;


        // 
    }
}
