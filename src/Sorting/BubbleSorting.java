package Sorting;

public class BubbleSorting implements Comparable  {



    public static  Integer [] arrayToSort = new Integer [] {1,4,6,34,76,45,27,24,754,78,534,21};

    public static boolean less (Comparable a, Comparable b) {
        return a.compareTo(b) <0;
    }

    public static void swap (Object [] arrayToSort, int i, int j) {
        Object swap = arrayToSort[i];
        arrayToSort[i] = arrayToSort[j];
        arrayToSort[j] = swap;
    }

    public static void printArray (Integer [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(arrayToSort[i]);
            System.out.print(" ");
        }
    }







    public static void main(String[] args) {



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


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
