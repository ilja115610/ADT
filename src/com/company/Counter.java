package com.company;

import java.util.ArrayList;
import java.util.List;

public class Counter {

   private String name;
    private int counter;


    public int [] array = new int [2];
    public int [] arr;



    public List<String> newList = null;

    public ArrayList<Integer> newLis;


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
