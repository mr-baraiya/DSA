//Write a program to implement stack using singly linked list.
import java.util.Scanner;

class Stack{
    class Node{
        int data;
        Node link;
        public Node(int data){
            this.data = data;
            this.link = null;
        }
    }
    Node TOP;
    public Stack(){
        this.TOP = null;
    }
    public void PUSH(int data){
        Node newNode = new Node(data);
        newNode.link = TOP;
        TOP = newNode;
    }
    public boolean isEmpty(){
        return TOP == null;
    }
    public int POP(){
        if(TOP == null){
            System.out.println("Stack Underflow!");
            return -1;
        }
        int temp = TOP.data;
        TOP = TOP.link;
        return temp;
    }
    public void display(){
        System.out.println();
        if(TOP == null){
            System.out.println("Stack Underflow!");
            return;
        }
        Node temp = TOP;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}
public class DS_LAB_60 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack stack = new Stack();
        int temp=0,n=0;
        while(temp != -1){
            System.out.println("Enter 1 = PUSH , 2 = POP , 0 = DISPLAY , -1 = terminate the Program.");
            temp = sc.nextInt();
            switch(temp){
                case 1:
                    System.out.println("Enter the element to be pushed :");
                    n = sc.nextInt();
                    stack.PUSH(n); 
                    break;
                case 2:
                    n = stack.POP();
                    System.out.println("POP : "+n);
                    break;
                case 0:
                    stack.display();
                    break;
                case -1:
                    break;    
                default:
                    System.out.println("Invalid Input!");
                    break;
            }
        }
        System.out.println("Sucessfully complated!");
    }
}
