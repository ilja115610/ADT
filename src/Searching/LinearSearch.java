package Searching;

public class LinearSearch {

    public static int [] arr = new int [] {1,2,3,4,5,6,7,8};

    public static int linearSearch (int [] a, int x) {
        int answer = -1;
         for (int i = 0; i < a.length; i++) {
             if (a[i] == x) {
                 answer = i;
             }
         }

        return answer;
    }


    public static int linSearchRecursive (int [] a, int x, int i) {
        if (i == a.length) {
            return -1;
        }
        if (a[i] == x) {
            return i;
        }
        else {
             return linSearchRecursive(a,x, i+1);
        }


    }

    public static void main(String[] args) {

        System.out.println(linearSearch(arr,5));

        System.out.println(linSearchRecursive(arr,4,0));

    }



}
