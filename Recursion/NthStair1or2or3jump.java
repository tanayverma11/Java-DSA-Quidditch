package Recursion;
import java.util.Scanner;
public class NthStair1or2or3jump {
    public static int stair(int n){
        if(n<=3) return n;
        return stair(n-1) + stair(n-2) + stair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        System.out.println(stair(n));
        sc.close();
    }
}
