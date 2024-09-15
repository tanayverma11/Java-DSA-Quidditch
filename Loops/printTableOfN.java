<<<<<<< HEAD
package PW.Loops;
=======
package PW.loops;
>>>>>>> 665db253f25221c065779d47f915872d3c8e0ef6
import java.util.Scanner;
public class printTableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        System.out.println("Multiplication Table of "+n+" is:");
        for(int i=1; i<=10; i++)
            System.out.println(n+" X "+i+" = "+(n*i));
    }
}
