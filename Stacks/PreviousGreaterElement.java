package Stacks;
import java.util.Stack;
// T.C: O(n) , S.C.: O(n)
public class PreviousGreaterElement {

    //Method - 1: Traversing from the start of array
    public static int[] findPreviousGreater(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n ; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    //Method - 2: Traversing from the end of array
    public static int[] findPreviousLarger(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        for (int i = n-2; i >= 0 ; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (!st.isEmpty()){
            ans[st.pop()] = -1;
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
        print(findPreviousGreater(arr,n));
        print(findPreviousLarger(arr,n));
    }
}
