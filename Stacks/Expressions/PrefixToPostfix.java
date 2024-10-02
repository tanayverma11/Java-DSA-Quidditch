package Stacks.Expressions;

import java.util.Stack;

public class PrefixToPostfix {

    public static void main(String[] args) {
        String prefix = "-9/*+5346";  // 953+4*6/-
        System.out.println(prefixToPostfix(prefix));
    }

    private static StringBuilder prefixToPostfix(String prefix) {
        Stack<StringBuilder> val = new Stack<>();
        for (int i = prefix.length()-1; i >= 0 ; i--) { //right to left traversal
            char ch = prefix.charAt(i);
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
        val.push((v1.append(v2)).append(operator)); // change order to: v1 v2 op
    }
}
