package Recursion;
import java.util.ArrayList;
public class StringSubsets {
    static ArrayList <String> arr= new ArrayList<>();
    public static void printSubsets(int i, String s, String ans){  //T.C. = O(2^n)
        if(i==s.length()) {
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1, s, ans+ch); //take
        printSubsets(i+1, s, ans);        //not take
    }
    public static void main(String[] args) {
        String str = "tanay";
        arr = new ArrayList<>();  //reset
        printSubsets(0, str, "");
        System.out.println(arr);
    }
}
