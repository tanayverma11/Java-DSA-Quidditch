package Stacks;
import java.util.Stack;
public class RecursiveReverseDisplay {   // T.C. = O(n)
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Original Stack Displayed: ");
        displayOriginal(st);
        System.out.println("Reversed Stack Displayed: ");
        displayReverse(st);
    }
    public static void displayReverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.println(top);
        displayReverse(st);
        st.push(top);
    }
    public static void displayOriginal(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        displayOriginal(st);
        System.out.println(top);
        st.push(top);
    }
}
