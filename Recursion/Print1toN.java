package Recursion;
import java.util.Scanner;
public class Print1toN {

    private static void printIncreasing(int x, int n){
        if(x>n) return;
        System.out.println(x);
        printIncreasing(x+1,n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printIncreasing(1,n); //using extra parameter
        sc.close();
    }
}
