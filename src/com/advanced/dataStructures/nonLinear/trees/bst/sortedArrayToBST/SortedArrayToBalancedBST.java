package com.advanced.dataStructures.nonLinear.trees.bst.sortedArrayToBST;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

public class SortedArrayToBalancedBST {
    public static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static TreeNode sortedArrayToBalancedBST(int[] arr, int s, int e){
        if(s > e){
            return null;
        }
        int mid = s + (e - s)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = sortedArrayToBalancedBST(arr, s, mid-1);
        root.right = sortedArrayToBalancedBST(arr, mid+1,e);
        return root;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        TreeNode root = sortedArrayToBalancedBST(arr, 0, arr.length-1);
        System.out.println("InOrder: " );
        inOrder(root);
    }
}
