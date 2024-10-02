package Stacks.Expressions;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println(infixToPostfix(infix));
    }

    private static StringBuilder infixToPostfix(String infix) {
        Stack<StringBuilder> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isDigit(ch)) {
                val.push(new StringBuilder(""+ch));
            }
            else if (ch == '(') {
                op.push(ch);
            }
            else if (ch == ')') {
                while (op.peek() != '(') {
                    performOperation(val,op);
                }
                op.pop();
            }
            else if (isOperator(ch)) {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    performOperation(val,op);
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()) {
            performOperation(val,op);
        }
        return val.pop();
    }

    private static void performOperation(Stack<StringBuilder> val, Stack<Character> op) {
        StringBuilder v2 = val.pop();
        StringBuilder v1 = val.pop();
        char o = op.pop();
        StringBuilder operator = new StringBuilder("" + o);
        val.push((v1.append(v2)).append(operator));
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }
}
