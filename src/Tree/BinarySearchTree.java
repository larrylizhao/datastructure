package Tree;

public class BinarySearchTree {

}

class BinaryTreeNode {
    public int val;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int val) {
        this.val = val;
    }

    /**
     * 向BST中插入节点
     * @param node BinaryTreeNode<T> 要插入的新节点
     */
    public void add(BinaryTreeNode node) {
        if(node != null) {
            // 小于当前节点，放在左边
            if(node.val < this.val){
                if(this.left == null) {
                    this.left = node;
                } else {
                    this.left.add(node);
                }
                // 大于当前节点，放在右边
            } else{
                if(this.right == null) {
                    this.right = node;
                } else {
                    this.right.add(node);
                }
            }
        }
    }

    /**
     * 中序遍历BST，输出数组
     * @param node BST根节点
     * @return 中序遍历的数组
     */
    public int[] inorderTraverse(BinaryTreeNode node) {

    }



}