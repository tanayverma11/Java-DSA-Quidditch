package PW.LinkedList;
public class ShallowCopyOfANode {
    public static void main(String[] args) {
        Node a = new Node(101);
        Node temp = a; // shallow copy
        // Node temp = new Node(101); // deep copy
        temp.val = 12;
        System.out.println(a.val);
        System.out.println(temp.val);
    }

}
