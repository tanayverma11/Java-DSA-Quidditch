<<<<<<< HEAD
package PW.Loops;
=======
package PW.loops;
>>>>>>> 665db253f25221c065779d47f915872d3c8e0ef6
import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + " is:");
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b);
        for (int i = 3; i <= n; i++) {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
