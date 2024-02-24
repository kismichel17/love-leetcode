package demo;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Objects;

public class MinimumDepthOfBinaryTree {

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        var depth = 1;
        var queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            var nodesCount = queue.size();
            for (int i = 0; i < nodesCount; i++) {
                var node = Objects.requireNonNull(queue.poll());

                if (node.left == null && node.right == null) {
                    return depth;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}