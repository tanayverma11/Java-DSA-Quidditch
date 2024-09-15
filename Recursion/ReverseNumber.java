package Recursion;
import java.util.Scanner;
import static Recursion.Power.powLogarithmic;
public class ReverseNumber {
    public static int revNum(int n, int l){
        if(l==1) return n;
        return ((n%10) * powLogarithmic(10, l-1)) + revNum(n/10, --l);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        int temp=n, length=0;
        while(temp!=0){
            length++;
            temp /= 10;
        }
        System.out.println("Reversed Number is: " + revNum(n,length));
    }
}
