package PW.recursion;
import java.util.Scanner;
public class NthStair1or3jump {
    public static int stair(int n){
        if(n<0) return 0;
        return n < 3 ? 1 : stair(n - 1) + stair(n - 3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        System.out.println(stair(n));
    }
}
