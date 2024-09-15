package PW.conditionals;
import java.util.Scanner;
public class profitLoss {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the cost price:");
            int cp=sc.nextInt();
            System.out.println("Enter the selling price:");
            int sp=sc.nextInt();
            PW.conditionals.profitLoss obj = new PW.conditionals.profitLoss();
           obj.transac(cp,sp);
        }
        void transac(int n, int m){
            if(n>m)
                System.out.println("There is Loss of "+(n-m));
            else if(m>n)
                System.out.println("There is profit of "+(m-n));
            else
                System.out.println("There is Break-Even");
        }
    }


