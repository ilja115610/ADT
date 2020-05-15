package LinkedList;

public class LinkedList {

    public Node first;
    public Node last;


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


    public void displayRev (Node current) {

        if (current == null) {
            return;
        }
        displayRev(current.next);
        System.out.println(current.data);
    }

    public void reverseList () {
        Node current = first;
        Node sled = null;
        Node pred = null;

        while(current!=null) {
            sled = current.next;
            current.next = pred;
            pred = current;
            current = sled;
        }
        first = pred;
    }

    public void reverseListRec (Node curr,Node sled, Node pred) {

        if (curr == null) {
            first = pred;
            return;
        }
        sled = curr.next;
        curr.next = pred;
        pred = curr;
        curr = sled;

        reverseListRec(curr,sled,pred);
    }



    public Node getFirst () {
        return first;
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