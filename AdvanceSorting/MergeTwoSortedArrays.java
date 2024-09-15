package PW.AdvanceSorting;
public class MergeTwoSortedArrays {
    static void mergeArray(int[] nums1, int[] nums2, int[] merged) {
        int i = 0, j = 0, k = 0, m = nums1.length, n = nums2.length;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j])
                merged[k++] = nums1[i++];
            else
                merged[k++] = nums2[j++];
        }
        while (i < m)
            merged[k++] = nums1[i++];
        while (j < n)
            merged[k++] = nums2[j++];
    }
    static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a = {12, 16, 20, 25, 35, 36, 41, 44};
        int[] b = {10,20,30,40,50,60,70};
        int[] c = new int[a.length+b.length];
        print(a);
        print(b);
        mergeArray(a,b,c);
        print(c);
    }
}
