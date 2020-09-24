package Tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private BinaryTreeNode root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(BinaryTreeNode root) {
        this.root = root;
    }

    public void add(BinaryTreeNode node) {
        if(root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    public List<Integer> inorderTraverse() {
        if(root != null) {
            return root.inorderTraverse();
        } else {
            return new ArrayList<Integer>();
        }
    }

    public static void main(String[] args) {
        BinarySearchTree root = new BinarySearchTree();
        int[] arr = {3,6,1,7,8,12,9,52};
        for (int i : arr) {
            root.add(new BinaryTreeNode(i));
        }

        List<Integer> treeArr = root.inorderTraverse();
        System.out.println(treeArr);
    }
}

class BinaryTreeNode {
    public int val;
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    public List<Integer> inorderArray = new ArrayList<Integer>();

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
            } else {
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
     * @return 中序遍历的数组
     */
    public List<Integer> inorderTraverse() {
        if(this.left != null) {
            inorderArray.addAll(this.left.inorderTraverse());
        }
        inorderArray.add(this.val);
        if(this.right != null) {
            inorderArray.addAll(this.right.inorderTraverse());
        }
        return inorderArray;
    }
}