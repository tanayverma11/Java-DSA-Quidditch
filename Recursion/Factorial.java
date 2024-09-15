package PW.recursion;
import java.util.Scanner;
public class Factorial {
    public static int facto(int n){
        if(n==0||n==1)   //base case
            return 1;
        return n*facto(n-1);  //recursive call
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        System.out.println(facto(n));
    }
}
