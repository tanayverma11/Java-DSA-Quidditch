package Stacks.Expressions;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";  //Ans = 4
        System.out.println(evaluatePostfix(postfix));
    }

    private static int evaluatePostfix(String postfix){
        Stack<Integer> val = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) { //left to right traversal
            char ch = postfix.charAt(i);
            if(Character.isDigit(ch)){
                val.push(ch - '0');
            } else{
                performOperation(val,ch);
            }
        }
        return val.pop();
    }

    private static void performOperation(Stack<Integer> val, char operator) {
        int v2 = val.pop();
        int v1 = val.pop();
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
