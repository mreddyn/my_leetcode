
public class LeastCommonAncestorOfBinaryTree {
    private static TreeNode fun(TreeNode root,TreeNode p,TreeNode q){
        if(root == null || root==p || root == q)
        return root;
    
    TreeNode low = fun(root.left,p,q);
      TreeNode high = fun(root.right,p,q);
      if(low!=null && high!=null)
          return root;
      if(low!=null)
          return low;
      if(high!=null)
          return high;
      return null;
    }
  
    public static void main(String[] args) {
    }
    
}
 class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }
