// finish task in a single loop 
// method slow fast pointer 

import java.util.Scanner;

public class middleoflinkedlist{

static class Node{
    int data;
    Node next;

Node(int data){
this.data = data;

}
}

static Node middleoflist(Node head){
    Node fast = head;
    Node slow = head;
    while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast=fast.next.next;
  }
return slow ;}

static void printll(Node head){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
    System.out.print("null");
}




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of node in LL : ");
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
for(int i=0;i<n;i++){
    int data = sc.nextInt();
    Node newNode = new Node(data);
    if(head ==null ){
        head = newNode;
        tail=newNode;
    }
    else {
         tail.next=newNode;
    
        tail=newNode;
    }   
}
 
printll(head);
Node middle = middleoflist(head);
System.out.println();
System.out.println("Middle of the Linked List : ");
System.out.println(middle.data);
}
}

