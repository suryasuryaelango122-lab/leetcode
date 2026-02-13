// Last updated: 2/13/2026, 9:45:08 AM
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] a, int l, int r) {
        if (l > r) return null;
        int m = (l + r) / 2;
        return new TreeNode(a[m], dfs(a, l, m - 1), dfs(a, m + 1, r));
    }
}
