package com.company;

public class ReverseStringStack {


    private int maxSize;
    private char [] array;
    private int top;

    public ReverseStringStack (int maxSize) {
        this.maxSize = maxSize;
        array = new char [maxSize];
        this.top = -1;

    }

    public void push (char a) {

        if (isFull()==true) {
            System.out.println("Stack overflow");
        }
        else{
            top++;
            array [top] = a;  }
    }

    public char pop () {
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
