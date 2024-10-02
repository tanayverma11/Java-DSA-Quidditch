package Stacks.Expressions;

import java.util.Stack;

public class PostfixToInfix {

    public static void main(String[] args) {
        String postfix = "953+4*6/-";  // (9-(((5+3)*4)/6))
        System.out.println(postfixToInfix(postfix));
    }

    private static StringBuilder postfixToInfix(String postfix) {
        Stack<StringBuilder> val = new Stack<>();
        for (int i = 0 ; i < postfix.length() ; i++) { //left to right traversal
            char ch = postfix.charAt(i);
            if (Character.isDigit(ch)) {
                val.push(new StringBuilder("" + ch));
            } else {
                performOperation(val, ch);
            }
        }
        return val.pop();
    }

    private static void performOperation(Stack<StringBuilder> val, char ch) {
        StringBuilder v2 = val.pop();
        StringBuilder v1 = val.pop();
        StringBuilder operator = new StringBuilder("" + ch);
        val.push(new StringBuilder(""+'(').append(v1.append(operator).append(v2).append(')'))); // change the order to: v1 op v2
    }
}
