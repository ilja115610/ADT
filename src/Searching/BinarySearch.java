package Searching;

public class BinarySearch {

   public static int [] arr = new int [] {1,2,3,4,5,6,7,8,9};

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

    public static void main(String[] args) {

       int abc =  biSearch(arr, 8);
       System.out.print(abc);
        }

    }



