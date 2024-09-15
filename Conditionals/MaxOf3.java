package Conditionals;
import java.util.Scanner;
public class MaxOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        MaxOf3 obj = new MaxOf3();
        obj.findMax(a,b,c);
    }
    void findMax(int a, int b, int c){
        if( (a>=b) && (a>c) )
            System.out.println("Greatest number is: "+a);
        else if ( (b>a) && (b>=c) )
            System.out.println("Greatest number is: "+b);
        else if ( (c>=a) && (c>b) )
            System.out.println("Greatest number is: "+c);
        else if (a==b && b==c)
            System.out.println("All 3 numbers are equal");

    }
}
