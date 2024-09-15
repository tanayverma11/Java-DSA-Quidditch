<<<<<<< HEAD
package PW.Loops;
=======
package PW.loops;
>>>>>>> 665db253f25221c065779d47f915872d3c8e0ef6
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number:");
        int m = sc.nextInt();
        System.out.println("Enter second Number:");
        int n = sc.nextInt();
        int gcd=1;
        for(int i=1; i<=m && i<=n; ++i)
            if( (m%i==0) && (n%i==0) )
                gcd = i ;
        System.out.println("GCD of "+m+" and "+n+" is: "+gcd);
    }
}
