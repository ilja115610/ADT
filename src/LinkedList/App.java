package LinkedList;

public class App {

    public static void main(String[] args) {

        DoublyLinkedList newList = new DoublyLinkedList();

        System.out.println(newList.isEmpty());






        newList.insertFirst(555);
        newList.insertFirst(444);

        newList.insertLast(111);
        newList.insertLast(222);

        newList.deleteFirst();
        newList.deleteLast();

        newList.displayList();



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
