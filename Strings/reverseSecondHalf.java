package PW.strings;
import java.util.Scanner;
import static PW.strings.reverseEachWord.reverse;
public class reverseSecondHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int i=0, j=n;
        if (n % 2 == 1)
            System.out.println("NOT POSSIBLE TO DIVIDE IN HALVES!");
        else {
            for (i = n/2; i < n; i++) {
                reverse(sb, i, j-1);
                i = j + 1;
                j = i;
            }
            System.out.println(sb);
        }
    }
}
