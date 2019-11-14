package LinkedList;

public class LinkedList {

    private Node first;
    private Node last;


    public LinkedList() {

    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        } else
            return false;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty() == true) {
            last = newNode;
        }
        newNode.next = first; // old first
        first = newNode;
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }


    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty() == true) {
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
            }
        last = newNode;
        }



    public Node deleteFirst () {
        Node temp = first;
        first = first.next;
        return  temp;
    }


}