package Stacks;
import java.util.Stack;

// T.C.: O(n), S.C.: O(3n)
public class LargestAreaRectangleInHistogram {

    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = calculateNSE(st, heights, n);
        while(!st.isEmpty()) st.pop(); //emptying the stack
        int[] pse = calculatePSE(st, heights, n);
        return findMaxArea(heights,nse,pse);
    }

    //calculating nse
    public static int[] calculateNSE(Stack<Integer> st, int[] heights, int n){
        int[] nse = new int[n];
        st.push(n - 1);
        nse[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();
            st.push(i);
        }
        return nse;
    }

    //calculating pse
    public static int[] calculatePSE(Stack<Integer> st, int[] heights, int n) {
        int[] pse = new int[n];
        st.push(0);
        pse[0] = -1;
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) pse[i] = -1;
            else pse[i] = st.peek();
            st.push(i);
        }
        return pse;
    }

    //maximum area of rectangle
    public static int findMaxArea(int[] heights,int[] nse, int[] pse){
        int max = -1;
        for (int i = 0; i < heights.length; i++) {
            int area = heights[i] * (nse[i] - pse[i] - 1);
            if (area > max) max = area;
        }
        return max;
    }

    //Driver method
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 3, 5};
        System.out.println(largestRectangleArea(arr));
    }
}
