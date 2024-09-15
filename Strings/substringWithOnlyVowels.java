// <<<<<<<<<<<<<<<<<<<<<<  R  E  D  O   >>>>>>>>>>>>>>>>>>>>>>>>

package PW.strings;
import java.util.Scanner;
public class substringWithOnlyVowels {

    public static void main(String[] args) {
        int cnt=0;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i+1; j < sb.length()+1 ; j++) {
                if(checkNumberOfVowels(new StringBuilder(sb.substring(i, j))));
                cnt++;
            }
        }
        System.out.println("No. of substring having all vowels are: "+cnt);
    }
    public static boolean checkNumberOfVowels(StringBuilder sub){
        int count=0;
        for (int i = 0; i < sub.length(); i++) {
            char ch = sub.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
             count++;
        }
        return count == sub.length()+1;
    }
}
