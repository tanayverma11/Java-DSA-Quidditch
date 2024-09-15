package Recursion;
import java.util.Scanner;
public class GCD {
    public static int hcf(int a, int b){    //iterative method
        for (int i = Math.min(a,b); i > 1 ; i--)
            if(a%i==0 && b%i==0) return i;
        return 1;
    }
    public static int gcd(int a, int b){    //recursive method
        return b % a == 0 ? a : gcd(b % a, a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b=sc.nextInt();
        System.out.println("GCD is: "+gcd(a,b));
    }
}
