package Strings;
import java.util.Arrays;
import java.util.Scanner;
public class LexicographicallyMaxWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        Arrays.sort(words,String.CASE_INSENSITIVE_ORDER);
        System.out.println("Lexicographically Maximum Word: " + words[words.length-1]);
    }
}
