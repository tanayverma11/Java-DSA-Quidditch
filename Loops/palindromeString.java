package Loops;

import java.util.Scanner;
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.next();
        s = s.toUpperCase();
        palindromeString obj = new palindromeString();
        if (obj.isPali(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    boolean isPali(String s) {
        int l = s.length();
        int c = 1;
        for (int i = 0, j = l - 1; i <= l / 2 && j >= l / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
