package com.company;

public class StackMain {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.isEmpty();
        stack.pop();
        for(int i=11; i<25; i++){
            stack.push(i);
        }

        stack.isEmpty();
        stack.print();

        stack.pop();
        stack.pop();
        stack.print();
    }
}
