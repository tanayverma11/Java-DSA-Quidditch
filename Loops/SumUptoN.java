package Loops;

import java.util.Scanner;
public class SumUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++)
                sum += i;
        System.out.println("The Sum upto "+n+" is "+sum);
    }
}
