package Stacks.Expressions;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";  // -9/*+5346
        System.out.println(postfixToPrefix(postfix));
    }

    private static StringBuilder postfixToPrefix(String postfix) {
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
        val.push(operator.append(v1.append(v2))); // change the order to: op v1 v2
    }
}
