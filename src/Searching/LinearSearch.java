package Searching;

public class LinearSearch {

    public static int [] arr = new int [] {3,4,8,3,6,4};

    public static int linearSearch (int [] a, int x) {
        int answer = -1;
         for (int i = 0; i < a.length; i++) {
             if (a[i] == x) {
                 answer = i;
             }
         }



        return answer;
    }

    public static void main(String[] args) {

        System.out.println(linearSearch(arr,5));

    }



}
