package Stacks;

import java.util.Scanner;
//Approach-2: No extra stack used. (Push an expression)
//T.C.: O(1) , S.C.: O(1)
public class MinStackWithoutExtraStack {
    private static final int MIN_STACK_SIZE = 100;
    private int[] stack = new int[MIN_STACK_SIZE];
    private int min = Integer.MIN_VALUE;
    private int top = -1;

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MIN_STACK_SIZE - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow!");
            return;
        }
        if(isEmpty()) {
            top++;
            stack[top] = value;
            min = value;
        }
        else if(value >= min){
            stack[++top] = value;
        }
        else {
            stack[++top] = (2*value - min);  //***
            min = value;
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return;
        }
        else if(stack[top] >= min) {
            int value = stack[top];
            top--;
        }
        else if(stack[top] <= min){
            min = (2*min - stack[top]);     //***
            int value = stack[top];
            top--;
        }
    }

    public int getMin() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return min;
    }

    public static void main(String[] args) {
        MinStackWithoutExtraStack minStack = new MinStackWithoutExtraStack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to push: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int element = sc.nextInt();
            minStack.push(element);
        }
        System.out.println("Minimum element: " + minStack.getMin());
        System.out.print("Enter the number of elements to pop: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            minStack.pop();
        }
        System.out.println("Minimum element after popping: " + minStack.getMin());
        sc.close();
    }
}
