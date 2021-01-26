package Searching;

public class BinarySearch {

   public static int [] arr = new int [] {1,2,3,4,5,6,7,8,9};


    /**
     *
     * @param a Given array for search
     * @param x A number to be searched
     * @return index of searched element
     */

   public static int biSearch (int [] a, int x) {
        int answer = -1;
        int p = 0;
        int r = a.length-1;
        while (p <= r) {
            int q = (p+r)/2;
            if (a[q] == x) {
                answer = q;
                return answer;
            }
            else if (a[q]>x) {
                r = q-1;
            }
            else if (a[q]<x) {
                p = q+1;
            }
        }
        return answer;
    }

    /**
     * Recursive solution
     * @param a Array of integers to be searched
     * @param x Searched integer
     * @param p first index of array
     * @param r last index of array
     * @return index of searched element
     */

    public static int recursiveBiSearch (int [] a, int x, int p, int r) {
       int q = (p+r)/2;
       if (p > r) {
           return -1;
       }
       else {
           if (a[q] == x) {
               return q;
           }
            else if (a[q] < x) {
                return recursiveBiSearch(a, x, q + 1, r);
           } else {
              return recursiveBiSearch(a, x, p, q - 1);
           }
       }
    }

    public static void main(String[] args) {

       int abc =  biSearch(arr, 8);
       System.out.println(abc);

       System.out.println(recursiveBiSearch(arr, 10, 0,8));



        }

    }



