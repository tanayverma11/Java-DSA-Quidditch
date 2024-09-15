package PW.LinkedList;
class DoublyLinkedList{ //User defined data structure
    private Node head;
    private Node tail;
    private int size;

    // method to display the complete Linked List
    void display(){  // T.C. = O(size)
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // method to insert an element at the beginning of the list
    void insertFront(int val){  // T.C. = O(1)
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    // method to insert an element at any given index of the list
    void insert(int idx, int val) throws Error { // T.C. = O(size)
        if(idx==0){
            insertFront(val);
            return;
        }
        if(idx==size){
            insertRear(val);
            return;
        }
        if(idx<0 || idx>size) throw new Error("Invalid Index!!!");
        // normal cases
        Node temp = new Node(val);
        Node x = head;
        //bringing 'x' to the idx-1 position
        for (int i = 0; i < idx-1; i++) x = x.next;
        //insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    // method to insert an element at the end of the list
    void insertRear(int val){  // T.C. = O(1)
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    // method to find the length/size of the list
    void size(){
        System.out.println("Length of Linked List is: "+size);
    }

    // method to return element at any given index of the list
    int getElement(int idx) throws Error{  // T.C. = O(size)
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0) throw new Error("Invalid Index!!!");
        Node temp = head;
        for (int i = 0; i < idx; i++) temp = temp.next;
        return temp.val;
    }

    // method to set a given value at any given index of the list
    void setElement(int idx,int val) throws Error{ // T.C. = O(size)
        if(idx==size-1) tail.val = val;
        if(idx>=size || idx<0) throw new Error("Invalid Index!!!");
        Node temp = head;
        for (int i = 0; i < idx; i++) temp = temp.next;
        temp.val = val;
    }

    // method to delete an element from the beginning of the list
    void deleteFront() throws Error{  // T.C. = O(1)
        if(head==null) throw new Error("Empty List");
        head = head.next;
        size--;
    }

    // method to delete an element from any given index of the list
    void delete(int idx) throws Error{   // T.C. = O(size)
        if(idx==0) {
            deleteFront();
            return;
        }
        if(idx<0 || idx>=size) throw new Error("Invalid Index!!!");

        Node x = head;
        // bringing 'x' to idx-1 position
        for (int i = 1; i < idx; i++) x = x.next;
        //check and update tail
        if(x.next==tail) tail = x;
        // deletion
        x.next = x.next.next;
        size--;
    }

    // method to delete an element from the end of the list
    void deleteRear() throws Error{   // T.C. = O(size)
        if(head==null) throw new Error("Empty List");
        if(head == tail) head = tail = null; //only 1 element
            // normal case
        else {
            Node x = head;
            //bringing 'x' up to the 2nd last element
            while(x.next.next != null) x = x.next;
            //deletion
            x.next = null;
            //update tail
            tail = x;
        }
        size--;
    }
}
public class DoublyLinkedListImplementation {
    // driver code/method
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

    }
}
