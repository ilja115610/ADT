package Sorting;

import java.util.Arrays;

public class InsertionSort {

    static int [] array = new int [] {1,9,20,34,58};

    public static int [] sortArray (int [] arr) {
        for (int i = 1; i < arr.length; i++) {
            int element = arr[i];
            int j = i-1;
            while (j >=0 && arr[j] > element) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;

            }

        }
        return arr;
    }




    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortArray(array)));


    }


}
