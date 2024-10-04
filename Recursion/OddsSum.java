package Recursion;
import java.util.Scanner;
public class OddsSum {

    private static int oddSum(int a, int b){
        if(a%2==0) ++a;
        if(a>b) return 0;
        return (a + oddSum(a+2,b));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start and end limit: ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println(oddSum(a,b));
        sc.close();
    }
}
