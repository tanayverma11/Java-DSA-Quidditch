package Stacks;
import java.util.Scanner;
import java.util.Stack;

public class PushAtBottomRecursion {
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
        Scanner sc=new Scanner(System.in);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        System.out.println("Enter element to push at bottom: ");
        int x=sc.nextInt();
        pushAtBottom(st,x);
        System.out.println(st);
    }

}
