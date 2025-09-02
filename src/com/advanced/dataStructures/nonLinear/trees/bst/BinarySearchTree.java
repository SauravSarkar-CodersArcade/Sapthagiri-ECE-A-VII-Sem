package com.advanced.dataStructures.nonLinear.trees.bst;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinarySearchTree {
    public static void inorder(TreeNode root){ // LDR
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
    static TreeNode insert(TreeNode root, int key){
        if(root == null){
            // Make the key the root node & return
            return new TreeNode(key);
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        }else if(key > root.data){
            root.right = insert(root.right, key);
        }
        return root;
    }
    public static TreeNode search(TreeNode root, int key){
        // Case 1: Empty
        // Case 2: What if the data is at the root node
        if(root == null || root.data == key){
            return root;
        }
        if(root.data < key){
            return search(root.right, key);
        }
        return search(root.left, key);
    }
    static TreeNode findMin(TreeNode root){
        TreeNode temp = root;
        while (temp != null && temp.left != null){
            temp = temp.left;
        }
        return temp;
    }
    public static TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return root;
        }
        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }else if(key > root.data){
            root.right = deleteNode(root.right, key);
        }else {
            // Node with only 1 child
            if(root.left == null){
                TreeNode temp = root.right;
                root = null;
                return temp;
            }else if(root.right == null){
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            // Node with both children
            // We find the inorder successor
            // It is the least value in the right subtree
            TreeNode temp = findMin(root.right);
            root.data = temp.data;
            // Delete the duplicate value
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 50);
        System.out.print("InOrder: ");
        inorder(root);
        insert(root, 20);
        insert(root,45);
        insert(root,58);
        insert(root,70);
        insert(root,23);
        System.out.println();
        System.out.print("InOrder: ");
        inorder(root);
        System.out.println();
        TreeNode res1 = search(root, 45);
        TreeNode res2 = search(root, 1000);
        if(res1 == null){
            System.out.println("45 not found in BST.");
        }else {
            System.out.println("45 found in BST.");
        }
        if(res2 == null){
            System.out.println("1000 not found in BST.");
        }else {
            System.out.println("1000 found in BST.");
        }
        root = deleteNode(root, 50);
        System.out.println("Inorder: ");
        inorder(root);
        System.out.println("\nNew Root: " + root.data);
    }
}
