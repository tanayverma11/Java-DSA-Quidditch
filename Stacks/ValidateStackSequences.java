package Stacks;
import java.util.Stack;

public class ValidateStackSequences {
    public static boolean isValidSequence(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for (int val : pushed) {
            st.push(val);
            while (!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                ++j;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        if(isValidSequence(pushed,popped))
            System.out.println("VALID");
        else System.out.println("INVALID");
    }
}
