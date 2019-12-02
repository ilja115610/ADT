package com.company;

public class HashTable {

    private String[] hashArray;
    private int arraySize; // total number of slots available in array
    private int size = 0; // counter of elements in hashtable

    public HashTable(int numOfSlots) {

        if (isPrime(arraySize)) {
            hashArray = new String[numOfSlots];
            arraySize = numOfSlots;
        } else {
            int nextPrime = getNextPrime(numOfSlots);
            hashArray = new String[nextPrime];
            arraySize = nextPrime;
            System.out.println("Hashtable size " + numOfSlots + " is not a prime number ");
            System.out.println("Hashtabe size changed to " + nextPrime);
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
    private int hashFunc1 (String word){
    int hashVal = word.hashCode();
    hashVal = hashVal % arraySize;
    if (hashVal < 0) {
        hashVal += arraySize;
    }

    return hashVal;
    }

    // calculates step size
    private int hashFunc2 (String word) {

        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;

        if (hashVal < 0) {
            hashVal += arraySize;
        }

        return 3 - hashVal % 3;

    }

    public void insert (String word) {
        int indexVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while(hashArray[indexVal] != null) {
            indexVal += stepSize;
            indexVal = indexVal % arraySize;
        }

        hashArray[indexVal] = word;
        System.out.println("Inserted word " + word);
        size++;
    }


    public String find (String word) {

        int indexVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while (hashArray[indexVal] != null) {
            if (hashArray[indexVal].equals(word)){
                return hashArray[indexVal];
            }
            indexVal += stepSize;
            indexVal = indexVal % arraySize;
        }


        return "Not found";

    }


    public void displayAll () {
        for (int i = 0; i < hashArray.length; i++) {
            if (hashArray[i] != null) {
                System.out.println(hashArray[i]);
            }
            else
                System.out.println("--");
        }
        System.out.println("");

    }





}