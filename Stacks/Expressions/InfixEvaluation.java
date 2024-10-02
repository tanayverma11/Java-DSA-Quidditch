package Stacks.Expressions;

import java.util.Stack;

public class InfixEvaluation {

    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println(evaluateInfix(infix));
    }

    private static int evaluateInfix(String infix) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            if (Character.isDigit(ch)) {
                val.push(ch - '0');
            }
            else if (ch == '(') {
                op.push(ch);
            }
            else if (ch == ')') {
                while (op.peek() != '(') {
                    performOperation(val, op);
                }
                op.pop();
            }
            else if (isOperator(ch)) {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    performOperation(val, op);
                }
                op.push(ch);
            }
        }
        while (!op.isEmpty()) {
            performOperation(val, op);
        }
        return val.pop();
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

    private static void performOperation(Stack<Integer> val, Stack<Character> op) {
        int v2 = val.pop();
        int v1 = val.pop();
        char operator = op.pop();
        switch (operator) {
            case '+':
                val.push(v1 + v2);
                break;
            case '-':
                val.push(v1 - v2);
                break;
            case '*':
                val.push(v1 * v2);
                break;
            case '/':
                val.push(v1 / v2);
                break;
        }
    }
}


