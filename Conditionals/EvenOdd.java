package Conditionals;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
//        if(n%2==0)
//            System.out.println(n+" is Even");
//        else
//            System.out.println(n+" is Odd");
        EvenOdd obj = new EvenOdd();
        boolean r = obj.isEven(n);
        if(r)
            System.out.println("EVEN");
        else
            System.out.println("ODD");
    }
    boolean isEven(int num){
        if(num%2==0)
            return true;
        else
            return false;
    }
}
