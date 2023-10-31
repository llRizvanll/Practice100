package Tree.root.traversal;

/**
 * https://leetcode.com/problems/binary-tree-postorder-traversal/description/
 */
class PostOrderNode {
    int data;

    PostOrderNode left, right;

    public PostOrderNode(int _data){
        data = _data;
        left = right = null;
    }
}
public class PostOrderTraversal {

    PostOrderNode root;

    void getPostOrderTraversal(PostOrderNode node){
        if (node == null) return;

        getPostOrderTraversal(node.left);
        getPostOrderTraversal(node.right);

        System.out.println("data => "+ node.data);
    }

    public static void main(String[] args) {
        PostOrderTraversal postOrderTraversal = new PostOrderTraversal();

        postOrderTraversal.root = new PostOrderNode(1);
        postOrderTraversal.root.left = new PostOrderNode(2);
        postOrderTraversal.root.right = new PostOrderNode(3);
        postOrderTraversal.root.left.left = new PostOrderNode(4);
        postOrderTraversal.root.left.right = new PostOrderNode(5);

        System.out.println("Post order traversal ");

        postOrderTraversal.getPostOrderTraversal(postOrderTraversal.root);
    }
}
