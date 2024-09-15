package AdvanceSorting;
public class ReversePairs {
        static int count = 0;
        public static void inversion(int[] a, int[] b){
            int i = 0, j = 0;
            while(i<a.length && j<b.length){
                if((long)a[i] > (long)2*(long)b[j]){
                    count += (a.length-i);
                    j++;
                }
                else i++;
            }
        }
        public static void mergesort(int[] arr){
            int n = arr.length;
            if(n==1) return; //base case
            //create two arrays of n/2 and n-n/2 size
            int[] a = new int[n/2];
            int[] b = new int[n-n/2];
            //copy-pasting
            System.arraycopy(arr, 0, a, 0, n / 2);
            if (n - n / 2 >= 0) System.arraycopy(arr, 0 + n / 2, b, 0, n - n / 2);
            //magic
            mergesort(a);
            mergesort(b);
            //count inversions
            inversion(a,b);
            //merge these 'a' and 'b'
            mergeArray(a,b,arr);
            // delete 'a' and 'b' (to improve space complexity)
            a = null; b = null;
        }
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
        public static int reversePairs(int[] nums) {
            count = 0;
            mergesort(nums);
            return count;
        }
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,1};
        System.out.println(reversePairs(arr));
    }
}
