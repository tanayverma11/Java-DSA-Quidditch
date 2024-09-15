package PW.strings;
import java.util.Scanner;
import static PW.strings.reverseEachWord.reverse;
public class reverseConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        StringBuilder rev = new StringBuilder();
        rev.append(sb);  //copy made
        int i=0, j=0, n=rev.length();
        while(j<n) {           //copy is reversed
            if (rev.charAt(j) != ' ') j++;
            else {
                reverse(rev, i, j - 1);
                i = j + 1;
                j = i;
            }
        }
        reverse(rev,i,j - 1);
        System.out.println(sb.append(rev));
    }
}
