package PW.Stacks;
public class ArrayImplementationOfStack {
    public static class Stack{
        int []st;
        int size;
        int top;
        public Stack() {    // Default constructor
            size = 5;
            st = new int[size];
            top = -1;
        }
        public Stack(int x){ // Parameterised Constructor
            size = x;
            st = new int[size];
            top = -1;
        }
        //Method push, to add element on stack top
        void push(int value){
            if(top==size-1){
                System.out.println("Overflow (Stack is FULL)");
                return;
            }
            st[++top] = value;
        }
        //Method pop, to delete element from stack top
        int pop(){
            if(top==-1){
                System.out.println("Underflow (Stack is EMPTY)");
                return -1;
            }
            return st[top--];
        }
        //Method peek, to find/display value at stack top
        int peek(){
            if(top==-1){
                System.out.println("Stack is EMPTY");
                return -1;
            }
            return st[top];
        }
        //Method display, to display all the elements currently in the stack
        void display(){
            if(top==-1) System.out.println("Stack is EMPTY");
            for (int i = top; i >= 0; i--) System.out.println(st[i]);
            System.out.println();
        }
        //Method size, to find and display size of stack
        int size(){
            return top+1;
        }
        //Method isFull, to check if the stack is full
        boolean isFull(){
            return top == st.length-1;
        }
        //Method isEmpty, to check if the stack is empty
        boolean isEmpty(){
            return top == -1;
        }
    }
    //Driver Method
    public static void main(String[] args) {
        Stack st = new Stack(5);
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.peek());
        System.out.println();
        st.display();
       // System.out.println(st.pop());
        System.out.println();
        st.display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(90);
    }
}
