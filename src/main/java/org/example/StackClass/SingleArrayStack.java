package org.example.StackClass;

import java.util.ArrayDeque;
import java.util.Deque;

public class SingleArrayStack {
    private final int maxSize;
    private final char[] stackArray;
    private int top;

    public SingleArrayStack(int s) {
        this.maxSize = s;
        this.stackArray = new char[maxSize];
        top = -1;
    }

    public char push(char data) {
        if (top < maxSize - 1) {
            top++;
            stackArray[top] = data;
            return data;
        }
        return 0;
    }

    public char pop() {
        if (top >= 0) {
            return stackArray[top--];
        }
        return 0;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public char top() {
        return stackArray[top];
    }

    public void printStack() {
        if (top >= 0) {
            System.out.println("Elements in stack : ");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }

    public static Boolean isBalanced(String input){
        Deque<Character> stack = new ArrayDeque<>();

        for (char c: input.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;

                char topChar = stack.pop();
                if (topChar == '{' && c != '}') return false;
                if (topChar == '(' && c != ')') return false;
                if (topChar == '[' && c != ']') return false;
            }
        }
        return stack.isEmpty();
    }

}
