package Recursion;

import java.util.Scanner;

public class DecimalToBinary {
    public static int decBinary(int n){
        if(n<2) return n; // base case
        return 10*decBinary(n/2) + n%2;
        //Ex. 5-->101
        // 5/2 = 2, 5%2 = 1
        // 2-->10
        // 2/2 = 1, 2%2 = 0
        // 1-->1 (base case)
        // 2-->10*1 = 10 + 0 --> 10
        // 5-->10*10 = 100 + 1 --> 101
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal (base-10) number: ");
        int n = sc.nextInt();
        System.out.println("Binary is: ");
        System.out.print(decBinary(n));
        sc.close();
    }
}
