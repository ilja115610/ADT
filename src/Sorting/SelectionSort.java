package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int [] array = new int [] {15,3,62,32,45,7,19,51};
        System.out.print(Arrays.toString(sortArray(array)));

    }

        public static int [] sortArray (int [] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<a[min]) {
                    min = j;
                }

            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        return a;
        }


}
