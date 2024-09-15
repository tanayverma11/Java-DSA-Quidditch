package PW.recursion;
import java.util.Scanner;
public class BinaryStringNoConsecutive1s {
    public static void printStrings(String ans, int n){
        int l=ans.length();
        if(l==n) {                          //base case
            System.out.println(ans);
            return;
        }
        if(l==0 || ans.charAt(l-1)=='0'){   //recursive case
            printStrings(ans+0, n);
            printStrings(ans+1, n);
        }
        else printStrings(ans+0, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        printStrings("",n);
    }
}
