package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets2 {
    //return the no. of brackets to be removed to make the sequence balanced
    public static int balancedBrackets(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int cnt=0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch=='(') st.push(ch);
            else if(st.size()>0 && str.charAt(i)==')') st.pop();
            else cnt++;
        }
        cnt = cnt + st.size();
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(balancedBrackets(str));
    }
}
