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
    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        if (root1 == null || root2 == null) {
            return false; 
        }

        int difference = target - root1.val; 
        if (searchBST(root2, difference)) {
            return true;
        }
       

        return twoSumBSTs(root1.left, root2, target) || twoSumBSTs(root1.right, root2, target);

    }

    public boolean searchBST(TreeNode root, int difference) {
        // given a BST and a number, return true or false if it is in the tree

        if (root == null) {
            return false; 
        }

        if (root.val > difference) {
            return searchBST(root.left, difference);
        } else if (root.val < difference) {
            return searchBST(root.right, difference);
        } else {
            return true; 
        }

       
    }
}
