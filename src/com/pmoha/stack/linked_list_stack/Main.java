package com.pmoha.stack.linked_list_stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(15);
        stack.push(19);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.delete();
        System.out.println(stack.isEmpty());
    }
}
