package com.company;

public class Stack {
    int index = -1;
    int stack[] = new int[10];

    public boolean isEmpty() {
        return index == -1 ? true : false;
    }

    public void push(int data) {
        if (index == 9) {
            System.out.println("Stack full. "+data+" not added");
        } else {
            stack[++index] = data;
        }
    }

    public int pop() {
        if (index == -1) {
            System.out.println("Stack empty.");
            return -1;
        } else {
            return stack[index--];
        }
    }

    public void print(){
        for (int i=0; i <= index; i++){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}
