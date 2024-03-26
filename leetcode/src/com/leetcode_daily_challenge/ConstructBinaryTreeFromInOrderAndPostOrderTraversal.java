package com.leetcode_daily_challenge;

public class ConstructBinaryTreeFromInOrderAndPostOrderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return null;
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
}
