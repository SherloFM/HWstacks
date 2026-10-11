package org.example;
import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> stack){
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();

        while (!stack.isEmpty()){
            temp1.push(stack.pop());
        }
        while (!temp1.isEmpty()){
            temp2.push(temp1.pop());
        }
        while (!temp2.isEmpty()){
            stack.push(temp2.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.toString());
        reverse(stack);
        System.out.println(stack.toString());
    }

}
