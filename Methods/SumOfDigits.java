package Methods;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        SumOfDigits obj = new SumOfDigits();
        obj.dgsum(n);
    }
    void dgsum(int a) {
        int n=a, sum=0,rem=0,c=0;
        while(n>0){
            rem=n%10;
            sum+=rem;
            c++;
            n/=10;
        }
        System.out.println("No. of Digits in "+a+" = "+c);
        System.out.println("Sum of Digits of "+a+" = "+sum);
        System.out.println("Square of "+a+" = "+(a*a));
    }
}
