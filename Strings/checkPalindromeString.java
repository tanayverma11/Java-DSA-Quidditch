package PW.strings;
import java.util.Scanner;
public class checkPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        StringBuilder sb = new StringBuilder(sc.next());
        checkPalindromeString obj = new checkPalindromeString();
        if (obj.isPali(sb))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    boolean isPali(StringBuilder sb) {
        int l = sb.length();
        int c = 1;
        for (int i = 0, j = l - 1; i <= l / 2 && j >= l / 2; i++, j--) {
            if (sb.charAt(i) != sb.charAt(j))
                return false;
        }
        return true;
    }
}
