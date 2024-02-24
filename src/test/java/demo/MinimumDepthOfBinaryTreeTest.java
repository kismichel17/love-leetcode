package demo;

import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumDepthOfBinaryTreeTest {

    @Test
    void minDepth1() {
        var root = new TreeNode(3);
        var leftChild = new TreeNode(9);
        var rightChild = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        root.left = leftChild;
        root.right = rightChild;

        assertThat(MinimumDepthOfBinaryTree.minDepth(root)).isEqualTo(2);
    }

    @Test
    void minDepth2() {
        var root = new TreeNode(2);
        var rightChild1 = new TreeNode(3);
        var rightChild2 = new TreeNode(4);
        var rightChild3 = new TreeNode(5);
        var rightChild4 = new TreeNode(6);

        root.right = rightChild1;
        rightChild1.right = rightChild2;
        rightChild2.right = rightChild3;
        rightChild3.right = rightChild4;

        assertThat(MinimumDepthOfBinaryTree.minDepth(root)).isEqualTo(5);
    }

    @Test
    void minDepth3() {
        assertThat(MinimumDepthOfBinaryTree.minDepth(null)).isEqualTo(0);
    }
}