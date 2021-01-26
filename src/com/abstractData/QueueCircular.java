package com.abstractData;

import java.util.NoSuchElementException;

/**
Fixed size queue which can accept integers infinitely, overwriting old elements
 */

public class QueueCircular {

    private int maxSize;
    private int front;
    private int back;
    private int [] array;
    int counter;

    public QueueCircular(int maxSize) {
        this.maxSize = maxSize;
        this.array = new int [maxSize];
        front = 0;
        back = -1;
        counter = 0;
    }

    public void add (int a) {
        counter++;
        back++;
        array [back] = a;

        if (counter == maxSize) {
            back = -1;

        }
    }

    public int remove () {
        if(front == maxSize) {
            throw new NoSuchElementException("Queue is empty");
        }
        int removed = front;
        front++;
        counter--;



        return array[removed];
    }

    public void view () {
        for (int i : array) {
            System.out.println(i);
        }
    }


    public int peekFront (){
        if (isEmpty()==true)
             System.out.println("No front element");

            return array[front];
    }


    public boolean isEmpty () {
        if (counter == 0) return true;
        else return false;
    }


}
