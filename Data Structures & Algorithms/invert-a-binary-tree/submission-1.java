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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        //swap children
        //save left value (root.left) in temp variable
        TreeNode temp = root.left;
        //replace left val with right
        root.left = root.right;
        //then set right val = to left value
        root.right = temp;

        //recursively does the same for the new children
        invertTree(root.left);
        invertTree(root.right);

        return root;
        
    }
}

//Time Complexity: O(n)
