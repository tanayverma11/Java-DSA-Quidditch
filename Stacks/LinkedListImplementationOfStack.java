package Stacks;
public class LinkedListImplementationOfStack {
    public static class Node {
        private int val;
        private Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static class Stack{
        private Node head = null;
        private int size = 0;

        //Method push, to add element on stack top
        void push(int value){
            Node temp = new Node(value);
            temp.next = head;
            head = temp;
            size++;
        }
        //Method pop, to delete element from stack top
        int pop(){
            if(head==null){
                System.out.println("Underflow (Stack is EMPTY)");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        //Method peek, to find/display value at stack top
        int peek(){
            if(head==null){
                System.out.println("Stack is EMPTY");
                return -1;
            }
            return head.val;
        }
        //Method display, to display all the elements currently in the stack
        void display(){
           displayRecursive(head);
        }
        void displayRecursive(Node h){
            if(h==null) return;
            displayRecursive(h.next);
            System.out.println(h.val);
        }
        //Method size, to find and display size of stack
        int size(){
            return size;
        }
        //Method isEmpty, to check if the stack is empty
        boolean isEmpty(){
            return head == null;
        }
    }
    //Driver Method
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.display();
        System.out.println(st.isEmpty());
    }
}
