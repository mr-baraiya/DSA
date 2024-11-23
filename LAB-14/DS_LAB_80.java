//80. Write a program to check whether the given tree is symmetric or not. 
public class DS_LAB_80 {
    public static void main(String[] args) {
        
        int [] arr = {6,5,7,3,6,5,7};
        Tree t = new Tree();
        Node root = new Node(10);

        Node newNode1 = new Node(6);
        Node newNode2 = new Node(5);
        Node newNode3 = new Node(7);

        root.left = newNode1;
        newNode1.left = newNode2;
        newNode1.right = newNode3;

        Node newNode6 = new Node(6);
        Node newNode5 = new Node(5);
        Node newNode7 = new Node(7);

        root.right = newNode6;
        newNode6.left = newNode7;
        newNode6.right = newNode5;

        boolean flag = t.isSymmetric(root);
        t.inOrder(root);
        if(flag){
            System.out.println("\nTree is Symmetric.");
        }else{
            System.out.println("\nTree is Not Symmetric.");
        }
    }
}

class Node{
    int data;
    Node left;
    Node right;

    public Node (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Tree{
    public void inOrder(Node temp){
        if(temp == null){
            System.out.println("Tree is Emnpty.");
            return;
        }
        if(temp.left != null){
            inOrder(temp.left);
        }
        System.out.print(temp.data+" ");
        if(temp.right != null){
            inOrder(temp.right);
        }
    }
    
    public boolean isSymmetric(Node root){
        if(root == null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(Node t1,Node t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 == null || t2 == null) {
            return false;
        }
        return (t1.data == t2.data) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}