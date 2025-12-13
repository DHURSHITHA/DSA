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
    int depth(TreeNode root)
    {
        if(root==null) return 0;
        int ld=depth(root.left);
        int rd=depth(root.right);
        if (root.left == null) return 1 + rd;
        if (root.right == null) return 1 + ld;
        return 1+Math.min(ld,rd);
    }
    public int minDepth(TreeNode root) {
        return depth(root);
    }
}
