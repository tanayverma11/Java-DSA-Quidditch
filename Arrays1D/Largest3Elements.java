package Arrays1D;
import java.util.Scanner;
public class Largest3Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays1D.Largest3Elements obj=new Arrays1D.Largest3Elements();
        obj.findLargestThree(arr,n);
    }
    void findLargestThree(int[] a, int l){
        int i, max1, max2,max3;
        if(l<3) {
            System.out.println("Invalid Array Size!");
        }
        max1=max2=max3=Integer.MIN_VALUE;
        for (i=0; i<l; i++){
            if(a[i]>max1){
               max3=max2;
               max2=max1;
               max1=a[i];
            }
            else if (a[i]>max2) {
                max3=max2;
                max2=a[i];
            }
            else if (a[i]>max3)
                max3=a[i];
        }
        System.out.println("The largest elements in the array are: "+max1+" "+max2+" "+max3);
    }
}
