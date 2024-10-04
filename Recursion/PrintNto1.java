package Recursion;
import java.util.Scanner;
public class PrintNto1 {

    private static void printDecreasing(int n){
        if(n==0) return;   //base case
        System.out.println(n);  //work
        printDecreasing(n-1);  // recursive call
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printDecreasing(n);
        sc.close();
    }
}
