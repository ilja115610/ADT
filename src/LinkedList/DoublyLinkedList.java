package LinkedList;

public class DoublyLinkedList {
    
    private Node first;
    private Node last;


    public DoublyLinkedList () {

    }

    public boolean isEmpty () {
        if (first == null) {
            return true;
        }
        else
            return false;
    }

    public void insertFirst (int data) {
        Node newNode = new Node ();
        newNode.data = data;
        if (isEmpty() == true) {
            last = newNode;
        }
        else {
            first.previous = newNode;
        }
        newNode.next = first; //old first
        first = newNode;

    }

        public void reverseList () {

        Node curr = first;
        Node pred = null;
        Node newHead = null;

        while (curr != null) {
            pred = curr.previous;
            curr.previous = curr.next;
            curr.next = pred;
            newHead = curr;
            curr = curr.previous;

        }
        first = newHead;

        }


        public void reverseRecurs (Node curr,Node pred, Node newHead) {

            if(curr == null){
                first = newHead;
                return;
            }
            pred = curr.previous;
            curr.previous = curr.next;
            curr.next = pred;
            newHead = curr;
            curr = curr.previous;

            reverseRecurs(curr,pred,newHead);
        }




    public Node getFirst () {
        return first;
    }

    public void displayList () {
    Node current = first;
    while (current != null) {
        System.out.println(current.data);
        current = current.next;
    }

    }

    public void insertLast (int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty() == true) {
            newNode = first;
        }
            else {
                last.next = newNode;
                newNode.previous = last;
        }
            last = newNode;

    }

    //assume non-empty list

    public int deleteFirst () {
        int temp = first.data;
        if (first.next == null) {
            last = null; }
        else {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    public int deleteLast () {
        int temp = last.data;
        if (last.previous == null) {
            first = null;
        }
        else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp;
    }



}
