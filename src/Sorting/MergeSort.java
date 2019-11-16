package Sorting;

import java.util.Arrays;

public class MergeSort {


    public static int [] arrayToSort = new int [] {12,8,32,4};



    public static void sort (int [] arr, int p, int r) {
        int mid = (p + r)/2;
        if (p >= r) {
            return;
        }
        sort(arr, p, mid);
        sort(arr, mid+1,r);
        merge(arr,p,mid,r);

    }


    public static void merge (int [] arr, int start, int mid, int end) {
        int [] auxArr = new int [(end-start)+1];
        int leftIndex = start;
        int rightIndex = mid+1;
        int k = 0;

        while (leftIndex <= mid && rightIndex <= end) {
            if (arr[leftIndex] < arr[rightIndex]) {
                auxArr[k] = arr[leftIndex];
                leftIndex++;
            }
            else {
                auxArr[k] = arr[rightIndex];
                rightIndex++;
            }
            k++;

        }

        if (leftIndex <= mid) {
            while (leftIndex <= mid) {
                auxArr[k++] = arr[leftIndex++];
            }
        }
        else {
            while (rightIndex <= end) {
                auxArr[k++] = arr[rightIndex++];
            }
        }

        for (int s = 0; s < auxArr.length; s++ ) {
            arr[start + s] = auxArr[s];
        }

    }

    public static int [] printArray (int [] arr){
        for(int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i]);
            System.out.print(" ");
        }
        return arr;
    }


    public static void main(String[] args) {

        sort(arrayToSort,0,3);
        printArray(arrayToSort);

    }


}
