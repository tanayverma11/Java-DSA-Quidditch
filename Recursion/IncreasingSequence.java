package Recursion;
import java.util.Scanner;
public class IncreasingSequence {
        public static void printSequence(int[] arr, int n, int k, int len) {
            if(k == len) {
                for (int i = 0; i < k; i++)
                    System.out.print(arr[i] + " ");
                System.out.println();
                return;
            }
            int i;
            if(len==0) i=1;
            else i = arr[len-1]+1;
            len++;
            while (i<=n){
                arr[len-1]=i;
                printSequence(arr,n,k,len);
                i++;
            }
            len--;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter value of 'n': ");
            int n= sc.nextInt();
            System.out.println("Enter value of 'k': ");
            int k= sc.nextInt();
            int[] arr = new int[k];
            int len = 0;
            printSequence(arr,n,k,len);
            System.out.println();
        }
}


