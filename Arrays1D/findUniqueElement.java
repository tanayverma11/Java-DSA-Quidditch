// incomplete
package PW.Arrays1D;
import java.util.Scanner;
public class findUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        findUniqueElement obj = new findUniqueElement();
        System.out.println("Unique elements are: ");
        obj.findUnique(arr,n);
        }
            void findUnique ( int[] a, int n){
                for(int i=0; i<n; i++) {
                    int count = 0;
                    for (int j = 0; j < n; j++) {
                        if (a[i] == a[j]) {
                            count++;
                        }
                    }
                     if(count==1)
                          System.out.print(a[i]+" ");
                }
        }
    }

