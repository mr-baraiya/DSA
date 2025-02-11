//Write a program to copy a linked list
import java.util.Scanner;

public class DS_LAB_63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int [] arr = {1,2,3,4,5,6,7,8,9}; 
        for(int i=0;i<arr.length;i++){
            list.insertAtLast(arr[i]);
        }
        list.display();
        LinkedList list2 = new LinkedList();
        list2 = copyLinkedList(list);
        list2.display();
        sc.close();
    }

    public static LinkedList copyLinkedList(LinkedList list){
        if(list.FIRST == null){
            return null;
        }
        LinkedList newList = new LinkedList();
        Node temp = list.FIRST;
        while(temp!=null){
            newList.insertAtLast(temp.data);
            temp = temp.link;
        }
        return newList;
    }
}
