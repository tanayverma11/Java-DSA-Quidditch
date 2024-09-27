package Recursion;
import java.util.Scanner;
public class Power {
    public static int powLinear(int a, int b){  //T.n.o. = b times, T.C. = O(b)
        if(b==0) return 1;
        return a*powLinear(a,b-1);
    }
    public static int powLogarithmic(int a, int b){  //T.n.o. = log base 2 b times, T.C. = O(log b)
        if(b==0) return 1;
        int ans = powLogarithmic(a,b/2);
        if(b%2==0) return ans * ans;
        return ans * ans * a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base: ");
        int a=sc.nextInt();
        System.out.println("Enter the exponent: ");
        int b=sc.nextInt();
        System.out.println(a+" raised to "+b+" = "+powLinear(a,b));
        System.out.println(a+" raised to "+b+" = "+powLogarithmic(a,b));
        sc.close();
    }
}
