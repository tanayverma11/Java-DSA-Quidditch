package Recursion;
import java.util.Scanner;
public class Print_1toN_AfterCall {

    private static void printIncreasing(int n){
        if(n==0) return;   //base case
        printIncreasing(n-1);  // recursive cal
        System.out.println(n);   // work (after call)
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printIncreasing(n);
        sc.close();
    }
}
