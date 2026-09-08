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
    public List<Integer> rightSideView(TreeNode root) {
        // use a BFS to get level-order traversal 
        
        List<Integer> res = new ArrayList<>(); 
        Deque<TreeNode> deck = new ArrayDeque<>(); 
        if (root != null) {
            deck.add(root);
        }

        while (!deck.isEmpty()) {
            int levelLength = deck.size(); 
            
            for (int i = 0; i < levelLength; i++) {
                TreeNode temp = deck.removeFirst(); 

                if (levelLength - i == 1) {
                    res.add(temp.val);
                }

                if (temp.left != null) {
                    deck.add(temp.left);
                }
                
                if (temp.right != null) {
                    deck.add(temp.right);
                }
            }
        }

        return res;
    }
}
