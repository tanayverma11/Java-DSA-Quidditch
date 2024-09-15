package PW.strings;
import java.util.Scanner;
public class countConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int count=0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' ||
                    sb.charAt(i) == 'u' || sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' ||
                    sb.charAt(i) == 'O' || sb.charAt(i) == 'U')
                ;
            else count++;
        }
        System.out.println(count);
    }
}
