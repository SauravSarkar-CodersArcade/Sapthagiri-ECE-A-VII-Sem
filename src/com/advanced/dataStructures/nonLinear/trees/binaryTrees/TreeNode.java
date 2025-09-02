package com.advanced.dataStructures.nonLinear.trees.binaryTrees;
import java.util.LinkedList;
import java.util.Queue;
public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null; // Node has no children at first
    }
    public static void preOrder(TreeNode root){ // DLR
        if(root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(TreeNode root){ // LDR
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void postOrder(TreeNode root){ // LRD
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void levelOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        // Queue Data Structure
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll(); // Remove the current element
            System.out.print(node.data + " ");
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        System.out.println();
    }
    public static int findHeight(TreeNode root){
        if(root == null) return 0;
        int lh = findHeight(root.left);
        int rh = findHeight(root.right);
        return Math.max(lh, rh) + 1;
    }
    public static void main(String[] args) {
        // Construct the tree from top to bottom, level by level, l to r
        // Level 0
        TreeNode root = new TreeNode(1);
        // Level 1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        // Level 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        // Level 3
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);
        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();
        System.out.print("InOrder: ");
        inOrder(root);
        System.out.println();
        System.out.print("PostOrder: ");
        postOrder(root);
        System.out.println();
        System.out.println("Level Oder or BFS: ");
        levelOrderTraversal(root);
        System.out.println(findHeight(root));
    }
}
