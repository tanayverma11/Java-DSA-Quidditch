package Stacks.Expressions;

import java.util.Stack;

public class PrefixToInfix {

    public static void main(String[] args) {
        String prefix = "-9/*+5346";  // (9-(((5+3)*4)/6))
        System.out.println(prefixToInfix(prefix));
    }

    private static StringBuilder prefixToInfix(String postfix) {
        Stack<StringBuilder> val = new Stack<>();
        for (int i = postfix.length()-1 ; i >= 0 ; i--) { //right to left traversal
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
        StringBuilder v1 = val.pop();  // order of v1 and v2 changed
        StringBuilder v2 = val.pop();
        StringBuilder operator = new StringBuilder("" + ch);
        val.push(new StringBuilder(""+'(').append(v1.append(operator).append(v2).append(')'))); // change the order to: v1 op v2
    }
}
