package com.company;


public class Tree {

    private Node root;

    public void insert (int key, String data) {

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

    public String findKey (int key) {
        if (root == null) {
            return "Not found";
        }
        else {
            Node current = root;
            Node parent;
            while(true){
                parent = current;
            if (current.key == key) {
                return current.data;}
                else if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        return "Not found";
                    }
                     if(current.key == key) {
                     parent.leftChild.key = key;
                     return current.data;}
            }
                    if (key > current.key) {
                        current = current.rightChild;
                        if (current == null) {
                            return "Not found";
                        }
                        if (current.key == key) {
                            parent.rightChild.key = key;
                            return current.data;
                        }

                }

            }
        }


    }





    public static void main(String[] args) {
        Tree biTree = new Tree ();
        biTree.insert(12,"John");
        biTree.insert(16,"Michael");
        biTree.insert(7,"George");

        String abc = biTree.findKey(9);

        System.out.println(abc);
    }



}
