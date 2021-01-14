package com.company;

import java.util.Hashtable;

public class HashTable <K,V>  {



    private Node[] hashArray;
    private int arraySize; // total number of slots available in array
    private int size = 0; // counter of elements in hashtable

    private static class Node<K,V> {
        K name;
        V num;

        public Node (K name,V num) {
            this.name = name;
            this.num = num;
        }
    }

    public HashTable(int numOfSlots) {

        if (isPrime(numOfSlots)) {
            hashArray =  new Node [numOfSlots];
            arraySize = numOfSlots;
        } else {
            int nextPrime = getNextPrime(numOfSlots);
            hashArray = new Node[nextPrime];
            arraySize = nextPrime;
            System.out.println("Hashtable size " + numOfSlots + " is not a prime number ");
            System.out.println("Hashtable size changed to " + nextPrime);
        }
    }

    private boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    private int getNextPrime (int num) {
        for (int i = num; true; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }

    // preferred array index positions
    private int hashFunc1 (K word){
    int hashVal = word.hashCode();
    hashVal = hashVal % arraySize;
    if (hashVal < 0) {
        hashVal += arraySize;
    }

    return hashVal;
    }

    // calculates step size
    private int hashFunc2 (K word) {

        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;

        if (hashVal < 0) {
            hashVal += arraySize;
        }

        return 3 - hashVal % 3;

    }

    public void insert (K name,V num) {
        Node<K,V> newNode = new Node<K, V>(name, num);
        int indexVal = hashFunc1(newNode.name);
        int stepSize = hashFunc2(newNode.name);

        while(hashArray[indexVal] != null) {
            indexVal += stepSize;
            indexVal = indexVal % arraySize;
        }

        hashArray[indexVal] = newNode;
        //System.out.println("Inserted word " + word);
        size++;
    }


    public V findByName (K word) {

        int indexVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while (hashArray[indexVal] != null) {
            if (hashArray[indexVal].name.equals(word)){
                return (V) hashArray[indexVal].num;
            }
            indexVal += stepSize;
            indexVal = indexVal % arraySize;
        }
        return null;
    }


    //public K findByNum (V num) {



    public void displayAll () {
        for (int i = 0; i < hashArray.length; i++) {
            if (hashArray[i] != null) {
                System.out.println(hashArray[i].name + " " + hashArray[i].num);
            }
            else
                System.out.println("--");
        }
        System.out.println("");

    }





}