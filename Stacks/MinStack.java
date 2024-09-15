package Stacks;

import java.util.Scanner;

public class MinStack {
    private static final int MIN_STACK_SIZE = 100;
    private int[] stack = new int[MIN_STACK_SIZE];
    private int[] minStack = new int[MIN_STACK_SIZE];
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
        top++;
        stack[top] = value;
        minStack[top] = (top > 0) ? Math.min(minStack[top - 1], value) : value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }

    public int getMin() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return minStack[top];
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
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
