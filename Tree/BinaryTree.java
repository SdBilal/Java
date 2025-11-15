package Tree;

public class BinaryTree {
    public Node root;
    public void insert(int data){
            root = insertrec(root, data);
    }
    public Node insertrec(Node root,int data){
        if (root == null) {
            root = new Node(data);
        } else if (root.data<data){
            root.left=insertrec(root.left,data);
        } else if (root.data>data) {
            root.right=insertrec(root.right,data);
        }
        return root;
    }
    public void inorder(){
        inorderrec(root);
    }
    public void inorderrec(Node root){
        if(root!=null){
            inorderrec(root.right);
            System.out.print(root.data + " ");
            inorderrec(root.left);
        }
    }
    public void preorder(){
        preorderrec(root);
    }
    public void preorderrec(Node root){
        if(root!=null){
            System.out.print(root.data + " ");
            preorderrec(root.right);
            preorderrec(root.left);
        }
    }
}
