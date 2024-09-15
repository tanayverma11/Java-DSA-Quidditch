package PW.Stacks;
import java.util.Stack;
public class CopyStack {   // T.C. = O(n) , S.C. = O(n)
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(8);
        st_original.push(11);
        st_original.push(3);
        st_original.push(42);
        System.out.println(st_original);
        Stack<Integer> st_temp = new Stack<>();
        while(!st_original.isEmpty()) st_temp.push(st_original.pop());
        Stack<Integer> st_copy = new Stack<>();
        while(!st_temp.isEmpty()) st_copy.push(st_temp.pop());
        System.out.println(st_copy);
    }
}
