public class MaximumDepthofBinaryTreeSolution {
    public int maxDepth(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int lfs=maxDepth(root.left);   
        int rts=maxDepth(root.right);   
        int total=Math.max(lfs,rts)+1;    
        return total;
    }
}
