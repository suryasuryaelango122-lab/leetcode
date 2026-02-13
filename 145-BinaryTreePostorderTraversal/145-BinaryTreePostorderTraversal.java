// Last updated: 2/13/2026, 9:44:56 AM
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
     List<Integer> a=new ArrayList<>();
     postorder(root,a);
     return a;   
    }
    void postorder(TreeNode root,List<Integer>a)
    {
        if(root==null)return;
            postorder(root.left,a);
            postorder(root.right,a);
            a.add(root.val);
    }
}