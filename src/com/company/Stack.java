package com.company;

public class Stack {

    private int maxSize;
    private int [] array;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        array = new int [maxSize];
        this.top = -1;

    }

    public void push (int a) {

        if (isFull()==true) {
            System.out.println("Stack overflow");
        }
        else{
            top++;
            array [top] = a;  }
    }

    public int pop () {
        int b = 0;
        if (isEmpty() == true) {
            System.out.println("The stack is Empty");
        } else {
            b = top;
            top--;
        }
        return array[b];
    }


    public int peek () {
        return array [top];
    }

    public boolean isEmpty () {

        if (top == -1) return true;
        else return false;
    }

    public boolean isFull () {
        if (top == maxSize-1) {
            return true;

        }
        else return false;
    }


}
