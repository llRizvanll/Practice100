package Tree.root.traversal;

class PreOrderNode{
    int data;
    PreOrderNode left,right;
    public PreOrderNode(int _data){
        data = _data;
        left = right = null;
    }
}
public class PreOrderTraversal {

    PreOrderNode root;

    public void getPreOrderItems(PreOrderNode node){


        if (node == null) return;

        System.out.println("Data => "+ node.data);

        getPreOrderItems(node.left);

        getPreOrderItems(node.right);

    }


    public static void main(String[] args) {

        PreOrderTraversal preorderObj = new PreOrderTraversal();
        preorderObj.root = new PreOrderNode(1);
        preorderObj.root.left = new PreOrderNode(2);
        preorderObj.root.right = new PreOrderNode(3);
        preorderObj.root.left.left = new PreOrderNode(4);
        preorderObj.root.left.right = new PreOrderNode(5);

        System.out.println("PreOrder traversal ");
        preorderObj.getPreOrderItems(preorderObj.root);

    }
}
