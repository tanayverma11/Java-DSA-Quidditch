package Stacks;
import java.util.Stack;
//circular array concept
//T.C.: O(4n)=>O(n)
//S.C.: O(2n) + O(n) -->for the stack in worst-case + for ans[]
public class NextGreaterElement2 {

    //Approach-1: Using array (hypothetical double size)
    public static int[] findNextLarger(int[] arr, int n){
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < i+n ; j++) {
                int idx = j % n; //hypothetical index
                if(arr[idx] > arr[i]){
                    ans[i] = arr[idx];
                    break;
                }
                ans[i] = -1;
            }
        }
        return ans;
    }

    //Approach-2: Using monotonic stack
    public static int[] findNextGreater(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for (int i = (2*n)-1; i >= 0 ; i--) {
            while(!st.isEmpty() && st.peek() <= arr[i % n]) {
                st.pop(); // remove smaller elements, and maintain monotonicity
            }
            if(i<n){
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(arr[i % n]);
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
        print(findNextLarger(arr,n));
        print(findNextGreater(arr,n));
    }
}
