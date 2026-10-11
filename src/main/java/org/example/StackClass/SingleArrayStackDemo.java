package org.example.StackClass;


import static org.example.StackClass.SingleArrayStack.isBalanced;

public class SingleArrayStackDemo {
    public static void main(String[] args) {

        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("((()))"));
        System.out.println(isBalanced("{[(])}"));
        System.out.println(isBalanced("([)]"));
        System.out.println(isBalanced("(()"));
    }
}
