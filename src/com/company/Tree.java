package com.company;


public class Tree {

    private Node root;

    public void insert (int key, int data) {

        Node newNode = new Node (key,data);

        if (root == null) {
            root = newNode;
        }
        else {
            Node current = root;
            Node parent;
         while (true) {
        parent = current;
        if (key < current.key) {
            current = current.leftChild;
        if (current == null) {
            parent.leftChild = newNode;
            return;}
        }
        if (key > current.key) {
            current = current.rightChild;
            if (current == null) {
                parent.rightChild = newNode;
                return;}
        }

         }
        }
    }

    public int findKey (int key) {
        if (root == null) {
            return -1;
        }
        else {
            Node current = root;
            Node parent;
            while(true){
                parent = current;
            if (current.key == key) {
                return key;}
                else if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        return -1;
                    }
                     if(current.key == key) {
                     parent.leftChild.key = key;
                     return key;}
            }
                    if (key > current.key) {
                        current = current.rightChild;
                        if (current == null) {
                            return -1;
                        }
                        if (current.key == key) {
                            parent.rightChild.key = key;
                            return key;
                        }

                }

            }
        }


    }





    public static void main(String[] args) {
        Tree biTree = new Tree ();
        biTree.insert(12,27);
        biTree.insert(16,25);
        biTree.insert(7,21);

        int abc = biTree.findKey(7);

        System.out.println(abc);
    }



}
