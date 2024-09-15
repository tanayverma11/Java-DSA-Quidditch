package Strings;
import java.util.Scanner;
public class SecondMaxDigitInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of digits(0-9): ");
        String str = sc.next();
        int n = str.length();
        char [] ch = str.toCharArray();
        SecondMaxDigitInString obj=new SecondMaxDigitInString();
        System.out.println("Second largest digit is: " + obj.findSecondLargest(ch,n));
    }
    char findSecondLargest(char[] arr, int n){
        char smax = 'x';
        char max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            else if (arr[i] < max && arr[i] > smax)
                smax = arr[i];
        }
        return smax;
    }
}
