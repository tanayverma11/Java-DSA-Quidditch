package PW.Stacks;
import java.util.Stack;
// T.C.: O(n) , Auxiliary Space: O(n)
public class NextGreaterElement {

    // method - 1 : start the scan from the end of the array
    public static int[] findNextGreater(int[] arr, int n){
        int[] ans = new int[n];
        ans[n - 1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for (int i = n-2; i >= 0 ; i--) {
            while(!st.isEmpty() && st.peek()<=arr[i]) {
                st.pop();       //-----> pop
            }
            if(st.isEmpty()) {
                ans[i]=-1;      //-----> ans mark
            }
            else {
                ans[i]=st.peek();
            }
            st.push(arr[i]);    //------> push
        }
        return ans;
    }

    // method - 2 : start the scan from the beginning of the array
    public static int[] findNextLarger(int[] arr, int n){
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < n ; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
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
        print(findNextGreater(arr,n));
        print(findNextLarger(arr,n));
    }
}
