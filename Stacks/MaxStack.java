package Stacks;
import java.util.Scanner;

public class MaxStack {
    private static final int MAX_STACK_SIZE = 100;
    private int[] stack = new int[MAX_STACK_SIZE];
    private int[] maxStack = new int[MAX_STACK_SIZE];
    private int top = -1;

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_STACK_SIZE - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow!");
            return;
        }
        top++;
        stack[top] = value;
        maxStack[top] = (top > 0) ? Math.max(maxStack[top - 1], value) : value;
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
        return maxStack[top];
    }

    public static void main(String[] args) {
        MaxStack maxStack = new MaxStack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements to push: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int element = sc.nextInt();
            maxStack.push(element);
        }
        System.out.println("Maximum element: " + maxStack.getMin());
        System.out.print("Enter the number of elements to pop: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            maxStack.pop();
        }
        System.out.println("Maximum element after popping: " + maxStack.getMin());
        sc.close();
    }
}