package Strings;
import java.util.Scanner;
public class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int num=0;
        for (int i = 0; i < n; i++)
            num = num * 10 + ((int) sb.charAt(i) - 48);
        System.out.println(num);
    }
}


