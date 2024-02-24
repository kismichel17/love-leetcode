package demo;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

class BalancedBinaryTreeTest {

    @Test
    void isBalanced1() {
        var root = new TreeNode(3);
        var leftChild = new TreeNode(9);
        var rightChild = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        root.left = leftChild;
        root.right = rightChild;

        assertThat(BalancedBinaryTree.isBalanced(root)).isTrue();
    }

    @Test
    void isBalanced2() {
        var root = new TreeNode(1);
        var rightChild = new TreeNode(2);
        var leftChild1 = new TreeNode(3, new TreeNode(4), new TreeNode(4));
        var leftChild = new TreeNode(2, leftChild1, new TreeNode(3));
        leftChild.left = leftChild1;
        root.left = leftChild;
        root.right = rightChild;

        assertThat(BalancedBinaryTree.isBalanced(root)).isFalse();
    }

    @Test
    void isBalanced3() {
        assertThat(BalancedBinaryTree.isBalanced(null)).isTrue();
    }
}