// Last updated: 2/13/2026, 9:45:16 AM
class Solution {
    public List<TreeNode> generateTrees(int n) {
        return n == 0 ? new ArrayList<>() : build(1, n);
    }

    private List<TreeNode> build(int start, int end) {
        List<TreeNode> res = new ArrayList<>();
        if (start > end) { res.add(null); return res; }
        for (int i = start; i <= end; i++)
            for (TreeNode l : build(start, i - 1))
                for (TreeNode r : build(i + 1, end)) {
                    TreeNode root = new TreeNode(i, l, r);
                    res.add(root);
                }
        return res;
    }
}
