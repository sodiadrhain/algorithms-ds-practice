public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList();
        postOrder(output, root);
        return output;
    }
    
    private void postOrder(List<Integer> output, TreeNode node) {
        if (node == null) return;        
        if (node.left != null) postOrder(output, node.left);
        if (node.right != null) postOrder(output, node.right);
        output.add(node.val);
    }
}
