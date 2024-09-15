package PW.conditionals;
import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of Triangle:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        TriangleType obj = new TriangleType();
        boolean res = obj.isTri(a,b,c);
        if(res)
            obj.triType(a,b,c);
        else
            System.out.println("These sides wouldn't make a Triangle!");
    }
    boolean isTri(int a, int b, int c){
        return (a + b > c) && (a + c > b) && (c + b > a);
    }
    void triType(int a, int b, int c){
        if ((a==b )&& (b==c))
            System.out.println("Equilateral Triangle");
       else if( (a==b) || (a==c) || (b==c) )
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }
}
