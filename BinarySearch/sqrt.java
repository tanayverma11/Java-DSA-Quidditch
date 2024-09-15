package PW.BinarySearch;
import java.util.Scanner;
public class sqrt {
        public static int mySqrt(int x) {
            if(x<=1) return x;
            int lo = 1, hi = x-1;
            while(lo<=hi){
                int m = lo + (hi-lo)/2;
                if (m==x/m) return m;
                else if (m>x/m) hi=m-1;
                else lo=m+1;
            }
            return hi;
        }
         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
             int x=sc.nextInt();
             int ans=mySqrt(x);
             System.out.println(ans);
        }
}
