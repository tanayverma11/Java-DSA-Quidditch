package Stacks.Expressions;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";  //Ans = 4
        System.out.println(evaluatePostfix(prefix));
    }

    private static int evaluatePostfix(String prefix){
        Stack<Integer> val = new Stack<>();
        for (int i = prefix.length()-1; i >= 0; i--) { //right to left traversal
            char ch = prefix.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch - '0');
            } else{
                performOperation(val,ch);
            }
        }
        return val.pop();
    }

    private static void performOperation(Stack<Integer> val, char operator) {
        int v1 = val.pop();  // order of v1 and v2 changed
        int v2 = val.pop();
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
