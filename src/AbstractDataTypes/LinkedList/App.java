package AbstractDataTypes.LinkedList;

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






    }


}
