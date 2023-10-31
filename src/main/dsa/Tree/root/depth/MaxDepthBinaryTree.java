package Tree.root.depth;

/**
 *
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        // Base Condition
        if (root == null) {
            return 0;
        }
        // Hypothesis
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        // Induction
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        MaxDepthBinaryTree tree = new MaxDepthBinaryTree();
        int depth = tree.maxDepth(root);
        System.out.println("Max Depth of Binary Tree: " + depth);
    }
}

