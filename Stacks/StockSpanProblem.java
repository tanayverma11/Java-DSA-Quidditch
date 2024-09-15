package Stacks;
import java.util.Stack;
public class StockSpanProblem {

    public static int[] calculateSpan(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        st.push(0);
        ans[0] = 1;
        for(int i=1; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = i+1;
            else ans[i] = i-st.peek();
            st.push(i);
        }
        return ans;
    }

    public static void print(int[]arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        int n = arr.length;
        print(arr);
        print(calculateSpan(arr,n));
    }
}
