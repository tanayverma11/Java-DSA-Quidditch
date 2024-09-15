package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        StringBuilder s = new StringBuilder(sc.next());
        System.out.println("Enter 2nd String: ");
        StringBuilder t = new StringBuilder(sc.next());
        if(isAnagram(s,t)) System.out.println("ANAGRAM");
        else System.out.println("NOT ANAGRAM");
    }
    public static boolean isAnagram(StringBuilder s, StringBuilder t){
        if(s.length() != t.length()) return false;
        char [] a = s.toString().toCharArray();
        char [] b = t.toString().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < b.length ; i++) {
            if(a[i] != b[i])
                return false;
        }
        return true;
    }
}
