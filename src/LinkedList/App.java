package LinkedList;

public class App {

    public static void main(String[] args) {


        DoublyLinkedList dl = new DoublyLinkedList();

        dl.insertFirst(1);
        dl.insertFirst(2);
        dl.insertFirst(3);
        dl.insertFirst(4);
        dl.insertFirst(5);


        dl.displayList();

        dl.reverseRecurs(dl.getFirst(),null,null);

        dl.displayList();












        Node n1 = new Node();
        n1.data = 8;

        Node n2 = new Node();
        n2.data = 9;


        Node n3 = new Node();
        n3.data = 4;


        Node n4 = new Node();
        n4.data = 2;

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        //System.out.println(listLength(n1));


    }

    public static int listLength (Node n) {
        int count = 0;
        Node current = n;
        while ( current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

}
