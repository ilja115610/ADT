package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSorting {




    private static <V extends Comparable<? super V>> boolean less (V a, V b) {
        return a.compareTo(b) <0;
    }

    private static void swap (Object [] arrayToSort, int i, int j) {
        Object swap = arrayToSort[i];
        arrayToSort[i] = arrayToSort[j];
        arrayToSort[j] = swap;
    }

    public static <V> void printArray (V [] a) {
        for (V v : a) {
            System.out.print(v);
            System.out.print(" ");
        }
    }

    public static<V extends Comparable<V>> void sort (V [] arrayToSort) {

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arrayToSort.length; i++) {
                if (less(arrayToSort[i], arrayToSort[i - 1])) {
                    swap(arrayToSort, i-1, i);
                    isSorted = false;
                }

            }
        }
        printArray(arrayToSort);
    }




    public static void main(String[] args) {


        Integer [] array = new Integer[]{1,2,9,23,74,25,3,5,63,10};

        String [] stringArray = new String[] {"A","F","L","B"};

        System.out.println(Arrays.toString(array));

        BubbleSorting.sort(array);








    }


}
