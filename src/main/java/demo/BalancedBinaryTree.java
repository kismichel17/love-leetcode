package demo;

import util.TreeNode;

public class BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isBalancedChildren(root) && isBalanced(root.left) && isBalanced(root.right);
    }

    private static boolean isBalancedChildren(TreeNode root) {
        return Math.abs(depth(root.left) - depth(root.right)) <= 1;
    }

    private static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var leftChildDepth = 1 + depth(root.left);
        var rightChildDepth = 1 + depth(root.right);
        return Math.max(leftChildDepth, rightChildDepth);
    }
}
