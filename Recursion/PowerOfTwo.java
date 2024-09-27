package Recursion;

import java.util.Scanner;

public class PowerOfTwo {
    public static boolean powOfTwo(int n){
        boolean res;
        if(n==1||n==2) return true;
        if(n<0 || (n>2 && n%2==1)) return false;
        res = powOfTwo(n/2);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if(powOfTwo(n)) System.out.println("true");
        else System.out.println("false");
        sc.close();
    }

}
