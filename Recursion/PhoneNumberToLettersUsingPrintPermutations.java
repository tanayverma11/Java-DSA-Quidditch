package Recursion;

import java.util.Scanner;

public class PhoneNumberToLettersUsingPrintPermutations {
    //Very Unoptimised Approach
    //Can be optimised using Backtracking or Backtracking with Pruning
    private static final String[] KEYPAD = {
            "", //0
            "", //1
            "abc", //2
            "def", //3
            "ghi", //4
            "jkl", //5
            "mno", //6
            "pqrs", //7
            "tuv", //8
            "wxyz", //9
    };

    private static void printPermutations(String ans, String s){
        //base case
        if(s.length()==0){
            System.out.print(ans+ " ");
            return;
        }
        int digit = s.charAt(0) - '0'; // get the first digit from phoneNumber
        String letters = KEYPAD[digit]; // get the string from KEYPAD
        for (int i = 0; i < letters.length() ; i++) {
            char ch = letters.charAt(i);
            printPermutations(ch+ans, s.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the PhoneNumber: ");
        String phoneNumber = sc.nextLine();
        System.out.println("The Letter Permutations are: ");
        printPermutations("",phoneNumber);
        sc.close();
    }
}
