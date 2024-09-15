package PW.Stacks;
import java.util.Stack;
public class ReverseStack {   // T.C. = O(n) , S.C. = O(n)
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(8);
        st_original.push(11);
        st_original.push(3);
        st_original.push(42);
        System.out.println(st_original);
        Stack<Integer> st_reversed = new Stack<>();
        while(!st_original.isEmpty()) st_reversed.push(st_original.pop());
        System.out.println(st_reversed);
    }
}
