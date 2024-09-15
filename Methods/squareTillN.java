<<<<<<< HEAD
package PW.Methods;
=======
package PW.methods;
>>>>>>> 665db253f25221c065779d47f915872d3c8e0ef6
import java.util.Scanner;
public class squareTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        squareTillN obj = new squareTillN();
        for(int i=1; i<=n; i++){
           int res = obj.sq(i);
            System.out.print(res+" ");
        }
    }
    int sq(int a) {
        return a*a;
    }
}
