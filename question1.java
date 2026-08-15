import java.util.*;

public class question1 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static void deletelist(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            
            if (temp.data == target) {
                temp.next = temp.next.next;
                break;
            }
            temp=temp.next;
 }
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;
        System.out.println("enter no of nodes : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;

        }
        System.out.println("enter the target : ");
        int target = sc.nextInt();
        printList(head);
        System.out.println();
        deletelist(head, target);
        System.out.println();
        printList(head);
    }

}