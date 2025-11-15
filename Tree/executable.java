package Tree;

public class executable {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(8);
        bt.insert(7);
        bt.insert(12);
        bt.insert(15);
        bt.insert(2);
        bt.insert(5);
        bt.inorder();
        System.out.println();
        bt.preorder();
    }
}
