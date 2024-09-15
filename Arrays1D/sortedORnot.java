package PW.Arrays1D;
import java.util.Scanner;
public class sortedORnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sortedORnot obj=new sortedORnot();
        if (obj.isSorted(arr,n)) System.out.println("The array is Sorted");
        else System.out.println("The array is Unsorted");
    }
    boolean isSorted(int[] a, int l){
        if(l==0 || l==1)
            return true;
       for(int i=1; i<l; i++)
             if(a[i-1]>a[i])
                   return false;
           return true;
    }
}
