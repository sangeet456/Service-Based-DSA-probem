import java.util.Scanner;

public class removeelementfromlinkedlist {
    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    static void printll(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    static Node removeelement(Node head,int val){
        if(head == null) return head;

        //removing head//
        while(head!=null && head.data == val){
            head = head.next;
        }

        //rest node remove //
        Node temp = head;
        while(temp != null && temp.next!=null){
            if(temp.next.data== val){
                temp.next= temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
return head;
    }
    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of linked list element : ");
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        printll(head);
        System.out.println();
        System.out.println("enter element to remove ;");
        int k = sc.nextInt();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++=");
        System.out.println("after removing given value: ");
        removeelement(head, k);
        printll(head);
    }

}
