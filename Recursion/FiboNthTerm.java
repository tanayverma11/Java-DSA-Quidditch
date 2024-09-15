package PW.recursion;
import java.util.Scanner;
public class FiboNthTerm {
    public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        System.out.println(n+" term of Fibonacci Series is: "+fibo(n));
    }
}

