package Methods;

import java.util.Scanner;
public class oddMtoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        oddMtoN obj = new oddMtoN();
        obj.printOdd(m,n);
    }
    void printOdd(int a, int b) {
        for(int i=a; i<=b; ++i)
            if(i%2==1)
                System.out.print(i+" ");
    }
}
