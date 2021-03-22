package Sorting;

import java.util.Arrays;

public class InsertionSort {

    static Integer [] array = new Integer [] {20,7,25,47,8};


    public static boolean less (Integer a, Integer b) {
        return Integer.compare(a,b) <0;
    }

    public static void swap (Integer [] array, int i, int j) {
        Integer swap = array [i];
        array[i] = array[j];
        array[j] = swap;
    }


    public static void printArray (Integer [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }

    }


    public static void main(String[] args) {

        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;
            while (j >= 0 && less(element, array[j])) {
                swap(array, j, j+1);
                j--;
            }
        }

     printArray(array);
    }
    }