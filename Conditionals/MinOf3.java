package PW.conditionals;
import java.util.Scanner;
public class MinOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        MinOf3 obj = new MinOf3();
        obj.findMin(a,b,c);
    }
    void findMin(int a, int b, int c){
        if(a<b){
            if(a<c)
                System.out.println("Smallest number is: "+a);
            else
                System.out.println("Smallest number is: "+c);
        }
        else {
            if(b<c)
                System.out.println("Smallest number is: "+b);
            else
                System.out.println("Smallest number is: "+c);
        }
    }
}
