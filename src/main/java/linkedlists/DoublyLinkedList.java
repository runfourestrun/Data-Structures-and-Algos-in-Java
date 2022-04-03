package linkedlists;

public class DoublyLinkedList {


    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> prev;


        public Node(E e, Node<E> n, Node<E> p) {

            element = e;
            next = n;
            prev = p;

        }


    }
}
