// Last updated: 2/13/2026, 9:45:13 AM
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        return p.val == q.val 
            && isSameTree(p.left, q.left) 
            && isSameTree(p.right, q.right);
    }
}
