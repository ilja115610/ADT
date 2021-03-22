package AbstractDataTypes;


import java.util.NoSuchElementException;

/**
 * Sorted BinaryTree with Generic type values
 * @param <V> is content of a Node
 */
public class BiTree<V> {

    private Node<V> root;

    /**
     * Helper class Node contains Key-Value pair
     * @param <V>
     */
   private static class Node<V> {

        Integer key;
        V data;
        Node<V> leftChild;
        Node<V> rightChild;

        public Node(Integer key, V data) {
            this.key = key;
            this.data = data;
        }
    }

    /**
     * Inserts new element in Tree in particular order based on (key values) existing elements
     * @param key value which is used to order elements
     * @param data Generic data
     */

    public void insert (Integer key, V data) {

        Node<V> newNode = new Node<>(key, data);

        if (root == null) {
            root = newNode;
        }
        else {
            Node<V> current = root;
            Node<V> parent;
         while (true) {
        parent = current;
        if (key<current.key) {
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

    /**
     * Finds element in Tree by provided Key
     * @param key of a Node
     * @return Generic value of found Node
     */

    public V findKey (Integer key) {
        if (root == null) {
            throw new NoSuchElementException();
        }
        else {
            Node<V> current = root;
            Node<V> parent;
            while(true){
                parent = current;
            if (current.key == key) {
                return current.data;}
                else if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        throw new NoSuchElementException();
                    }
                     if(current.key == key) {
                     parent.leftChild.key = key;
                     return current.data;}
            }
                    if (key > current.key) {
                        current = current.rightChild;
                        if (current == null) {
                            throw new NoSuchElementException();
                        }
                        if (current.key == key) {
                            parent.rightChild.key = key;
                            return current.data;
                        }
                }
            }
        }

    }

    public void printTree () {
        Node<V> current = root;


    }


    public static void main(String[] args) {
        BiTree<String> biTree = new BiTree<>();
        biTree.insert(12,"John");
        biTree.insert(16,"Michael");
        biTree.insert(7,"George");

        String abc = biTree.findKey(9);

        System.out.println(abc);

        biTree.printTree();
    }



}
