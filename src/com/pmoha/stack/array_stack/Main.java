package com.pmoha.stack.array_stack;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(4);
        System.out.println("Is Stack Empty: " + newStack.isEmpty());
        System.out.println("Is Stack Full: " + newStack.isFull());
        newStack.push(1);
        newStack.push(11);
        newStack.push(15);
        newStack.push(93);
        System.out.println("Is Stack Empty: " + newStack.isEmpty());
        System.out.println("Is Stack Full: " + newStack.isFull());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
    }
}
