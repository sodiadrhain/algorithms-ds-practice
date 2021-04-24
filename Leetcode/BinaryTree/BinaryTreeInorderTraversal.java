public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inorder(root,list);
        return list;
    }
    
    public void inOrder(TreeNode node,List<Integer> list){
        if(node == null){
            return;
        }
            inorder(node.left,list);
            list.add(node.val);
            inorder(node.right,list);
    }
}