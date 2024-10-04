package Arrays1D;
import java.util.Scanner;
import static java.lang.Math.max;
public class NextGreatest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {12,8,41,60,2,49,16,28,21};
        int n = a.length;
        int[] ans = new int[n];
        ans[n-1]=-1;
        int nge = a[n-1];
        //loop from end to find nge and store in ans[i]
        for (int i = n-2; i >= 0; i--) {
            ans[i] = nge;
            nge = max(nge,a[i]);
        }
        //printing
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
        sc.close();
    }
}
