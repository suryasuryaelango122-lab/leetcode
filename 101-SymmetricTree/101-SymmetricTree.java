// Last updated: 2/13/2026, 9:45:12 AM
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return sym(root.left, root.right);
    }

    private boolean sym(TreeNode a, TreeNode b) {
        if (a == b) return true;
        if (a == null || b == null || a.val != b.val) return false;
        return sym(a.left, b.right) && sym(a.right, b.left);
    }
}
