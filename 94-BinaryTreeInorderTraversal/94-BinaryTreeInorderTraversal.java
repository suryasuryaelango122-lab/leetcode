// Last updated: 2/13/2026, 9:45:18 AM
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> b = new ArrayList<>();
        inorder(root, b);
        return b;
    }

    void inorder(TreeNode root, List<Integer> b) {
        if (root == null) return;
        inorder(root.left, b);
        b.add(root.val);
        inorder(root.right, b);
    }
}
    
