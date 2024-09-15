package LinkedList;
class Node {
    int val;
    Node next;
    //parameterised constructor
    Node(int val){
        this.val = val;
    }
}
public class ListNodeClass {
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static void printRecursive(Node head) {
        if(head == null) return; // base case
        System.out.println(head.val);
        printRecursive(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(210);
        Node c = new Node(230);
        Node d = new Node(98);
        Node e = new Node(11);

        a.next = b; // 10->20
        b.next = c; // 10->20->30
        c.next = d; // 10->20->30->40
        d.next = e; // 10->20->30->40->50

        //displaying
        printRecursive(a);
    }
}
