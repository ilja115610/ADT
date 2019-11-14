package com.company;

public class Main {

    public static void main(String[] args) {

        Counter newCount = new Counter ("times");
        newCount.increment();
        System.out.println(newCount.toString());

        //Stack newStack = new Stack (5);
        //System.out.println(reverseString("Hello"));

        QueueCircular nq = new QueueCircular(4);
        nq.add(55);
        nq.add(43);
        nq.add(334);
        nq.add(232);
        nq.add(32);
        nq.add(67);




        System.out.println(nq.remove());
        System.out.println(nq.remove());
        System.out.println(nq.remove());
        System.out.println(nq.remove());
        System.out.println(nq.remove());
        System.out.println(nq.remove());

        //System.out.println(nq.peekFront());
    }


    public static String reverseString (String str) {
        int stackSize = str.length();
        ReverseStringStack stroka = new ReverseStringStack(stackSize);
        for (int i = 0; i < str.length(); i++) {
            stroka.push(str.charAt(i));

        }
        String line = "";
        while (! stroka.isEmpty()) {
        line += stroka.pop();
        }
        return line;
    }

}
