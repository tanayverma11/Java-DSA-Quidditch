//// print all the increasing sequences of length k from first n natural numbers
//package PW.recursion;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class IntegerSubsets {
//    static ArrayList<String> arr= new ArrayList<>();
//    public static void printSubsets(int i, int k, int n, String ans){
//        if(i==s.length()) {
//            arr.add(ans);
//            return;
//        }
//        char ch = s.charAt(i);
//        printSubsets(i+1, s, ans+ch); //take
//        printSubsets(i+1, s, ans);        //not take
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter value of n:");
//        int n = sc.nextInt();
//        System.out.println("Enter value of k:");
//        int k = sc.nextInt();
//        arr = new ArrayList<>();  //reset
//        printSubsets(0, k, n, "");
//        System.out.println(arr);
//    }
//}
