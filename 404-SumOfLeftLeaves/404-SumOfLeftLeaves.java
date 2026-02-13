// Last updated: 2/13/2026, 9:44:40 AM
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
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> roots = new LinkedList<>();
        int sum = 0;
        roots.offer(root);
        while (!roots.isEmpty()) {
            TreeNode temp = roots.poll();
            if (temp.left != null) {
                if (temp.left.left == null && temp.left.right == null) {
                    sum += temp.left.val;
                } else {
                    roots.offer(temp.left);
                }
            }
            if (temp.right != null) {
                roots.offer(temp.right);
            }
        }
        return sum;
    }
}
