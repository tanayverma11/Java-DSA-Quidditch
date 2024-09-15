package PW.Arrays1D;
import java.util.Scanner;
public class mergeSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //inputting
        System.out.println("Enter size of 1st array:");
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        System.out.println("Enter array elements:");
        for (int i = 0; i < m; i++)
            nums1[i] = sc.nextInt();
        System.out.println("Enter size of 2nd array:");
        int n = sc.nextInt();
        int[] nums2 = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            nums2[i] = sc.nextInt();
        int l=m+n;
        int[] merged = new int[l];                  // new Array created of size m+n
        mergeSortedArrays obj = new mergeSortedArrays();
        obj.mergeArray(nums1, nums2, merged, m, n,l); // merge function called
        System.out.print("The Merged Array is: ");
        for (int i=0; i<l; i++)
            System.out.print(merged[i]+" ");
    }
        void mergeArray(int[] nums1, int[] nums2, int[] merged, int m, int n, int l) {
            int i = 0, j = 0, k = 0;
            while (i < m && j < n) {
                if (nums1[i] < nums2[j])
                    merged[k++] = nums1[i++];
                else
                    merged[k++] = nums2[j++];
            }
            while (i < m)
                merged[k++] = nums1[i++];
            while (j < n)
                merged[k++] = nums2[j++];
        }
}
