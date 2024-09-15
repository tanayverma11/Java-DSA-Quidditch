package PW.Stacks;
import java.util.Stack;
public class DisplayStack {  // T.C. = O(n)
    public static void main(String[] args) {
        Stack<Integer> st_original = new Stack<>();
        st_original.push(1);
        st_original.push(2);
        st_original.push(3);
        st_original.push(4);
        //System.out.println(st_original);
        //while(!st_original.isEmpty()) System.out.println(st_original.pop());
        //Display using array
        int n = st_original.size();
        int[] arr = new int[n];
        for(int i=n-1; i>=0; i--) arr[i] = st_original.pop();
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
            st_original.push(arr[i]);
        }
    }
}
