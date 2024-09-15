package Strings;
import java.util.Scanner;
public class UpdateOddPositionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++)
            if(i%2 == 1)
                sb.setCharAt(i,'#');
        System.out.println(sb);
    }
}
