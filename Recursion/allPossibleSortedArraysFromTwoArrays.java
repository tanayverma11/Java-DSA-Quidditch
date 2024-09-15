package PW.recursion;

public class allPossibleSortedArraysFromTwoArrays {
    public static void main(String[] args) {
        int[] a = {10, 15, 25};
        int[] b = {20, 30};
        int m = a.length;
        int n = b.length;
        boolean flag = true;
        fun(a,b,n,m,flag);
    }

    public static void fun(int[] a, int[] b, int m, int n, boolean flag) {
        int i=0,j=0;
        if (flag) {
            while(i<m || j<n){
                while (a[i]<b[j]) {
                    System.out.print(a[i] + " " + b[j]);
                   // i++;
                    j++;
                }
                i++;
            }
        }
    }
}
