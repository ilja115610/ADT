package Sorting;

public class BubbleSorting<V extends Comparable<V>>   {



    private final V [] arrayToSort;

    public BubbleSorting (V [] arrayToSort) {
       this.arrayToSort = arrayToSort;
    }

    private boolean less (Comparable<V> a, Comparable<V> b) {
        return a.compareTo((V) b) <0;
    }

    private void swap (Object [] arrayToSort, int i, int j) {
        Object swap = arrayToSort[i];
        arrayToSort[i] = arrayToSort[j];
        arrayToSort[j] = swap;
    }

    public  void printArray (V [] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(arrayToSort[i]);
            System.out.print(" ");
        }
    }

    public void sort () {
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
        BubbleSorting<Integer> sorting = new BubbleSorting<>(array);

        sorting.sort();






    }


}
