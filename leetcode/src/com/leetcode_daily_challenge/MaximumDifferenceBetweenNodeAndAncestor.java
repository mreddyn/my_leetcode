package com.leetcode_daily_challenge;

public class MaximumDifferenceBetweenNodeAndAncestor {
    private int maxAncestorDiff(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxDiff[] = new int[1];
        dfs(root, root.val, root.val, maxDiff);
        return maxDiff[0];
    }

    private void dfs(TreeNode root, int min, int max, int maxDiff[]) {
        if (root == null) {
            return;
        }

        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        maxDiff[0] = Math.max(maxDiff[0], Math.abs(max - min));
        dfs(root.left, min, max, maxDiff);
        dfs(root.right, min, max, maxDiff);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        };

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        };
    }

    public static void main(String[] args) {
        MaximumDifferenceBetweenNodeAndAncestor solution = new MaximumDifferenceBetweenNodeAndAncestor();
        TreeNode root = solution.new TreeNode(8);
        root.left = solution.new TreeNode(3);
        root.right = solution.new TreeNode(10);
        root.left.left = solution.new TreeNode(1);
        root.left.right = solution.new TreeNode(6);
        root.left.right.left = solution.new TreeNode(4);
        root.left.right.right = solution.new TreeNode(7);
        root.right.right = solution.new TreeNode(14);
        root.right.right.left = solution.new TreeNode(13);
        System.out.println(solution.maxAncestorDiff(root));
    }
}
