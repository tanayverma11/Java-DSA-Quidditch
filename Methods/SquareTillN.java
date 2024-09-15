package Methods;

import java.util.Scanner;
public class SquareTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        SquareTillN obj = new SquareTillN();
        for(int i=1; i<=n; i++){
           int res = obj.sq(i);
            System.out.print(res+" ");
        }
    }
    int sq(int a) {
        return a*a;
    }
}
