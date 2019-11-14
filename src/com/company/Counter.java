package com.company;

public class Counter {

   private String name;
    private int counter;

    public Counter(String str) {
        this.name = str;
    }

    public void increment () {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return counter + " " + name ;
    }
}
