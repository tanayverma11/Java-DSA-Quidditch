package Stacks;
import java.util.Scanner;
import java.util.Stack;

public class ReverseStackRecursive {
    public static void reverseRecursive(Stack<Integer> st){
        if(st.size() == 1) return;
        int top = st.pop();
        reverseRecursive(st);
        pushAtBottom(st,top);
    }
    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverseRecursive(st);
        System.out.println(st);
    }
}
