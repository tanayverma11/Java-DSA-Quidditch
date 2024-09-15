package PW.recursion;
import java.util.Scanner;
public class GenerateParenthesis {
    public static void printValidParenthesis(int open,int close,int n,String ans){
        if(ans.length()==2*n){
            System.out.println(ans);
            return;
        }
        if(open<n) printValidParenthesis(open+1,close,n,ans+"(");
        if(close<open) printValidParenthesis(open,close+1,n,ans+")");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        printValidParenthesis(0,0,n,"");
    }
}
