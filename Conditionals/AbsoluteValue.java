package PW.conditionals;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int num=sc.nextInt();
        if(num>=0)
            System.out.println("Absolute Value is: "+num);
        else{
            int abs = -(num);
            System.out.println("Absolute Value is: "+abs);
        }
    }
}
