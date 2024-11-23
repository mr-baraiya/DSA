//79. Write a program to check whether the given two trees are same or not.
public class DS_LAB_79 {
    public static void main(String[] args) {
        
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};

        Tree t1 = new Tree();
        Node root1 = t1.insertArr(arr1);
        Tree t2 = new Tree();
        Node root2 = t2.insertArr(arr2);
        boolean flag = t1.compare(root1, root2);

        if(flag){
            System.out.println("Both Tree Are Same.");
        }else{
            System.out.println("Both Tree Are Not Same.");
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
    public Node insertArr(int [] arr){
        Node root = null;
        for(int i=0;i<arr.length;i++){
            root = insert(root , arr[i]);
        }
        return root;
    }
    public Node insert(Node root,int data){
        if(root == null){
            return root = new Node(data);
        }
        if(data < root.data){
            root.left = insert(root.left,data);
        }else if(data > root.data){
            root.right = insert(root.right,data);
        }
        return root;
    }
    public boolean compare(Node root1,Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        boolean flag1 = compare(root1.left, root2.left);
        boolean flag2 = compare(root1.right, root2.right);

        if(flag1 && flag2){
            if(root1.data == root2.data){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
}