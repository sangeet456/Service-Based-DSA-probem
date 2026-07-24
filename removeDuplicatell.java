import java.util.*;

public class removeDuplicatell {

static class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
//=====================================================================================================
static void llprint(Node head){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data + " ");
        temp=temp.next;
    }
    System.out.println("null");
}

//=================================================================================================
static Node removeduplicate(Node head){
    if(head == null || head.next== null){
        return head;
    }
    Node curr = head;
    while(curr.next != null){
        if(curr.data == curr.next.data){
            curr.next=curr.next.next;
        }
        else {
            curr = curr.next;
        }
    
}
return head;
}


//================================================================================================
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter no of nodes : ");
 int n = sc.nextInt();
 Node head = null;
 Node tail = null;
 for(int i=0;i<n ;i++){
    int value = sc.nextInt();
    Node newNode = new Node(value);

     if(head == null){
    head = newNode;
    tail = newNode;
 
}
else {
    tail.next = newNode;
    tail = newNode;
}
 }
System.out.println("original Linked List : ");
llprint(head);
System.out.println();
System.out.println("=======================================================================");
System.out.println();
System.out.println("Linked List After duplicate removal : ");
removeduplicate(head);
llprint(head);
    
}
    
}
