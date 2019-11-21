package LinkedList;

public class App {

    public static void main(String[] args) {

       LinkedList newList = new LinkedList();
       newList.insertFirst(10);
        newList.insertFirst(20);
        newList.insertFirst(30);
        newList.insertFirst(40);



        newList.reverseList(newList.first);





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
