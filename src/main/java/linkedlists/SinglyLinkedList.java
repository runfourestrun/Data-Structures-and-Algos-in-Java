package linkedlists;

/***
 * Alternative to  Array-based structures. A linked list, in it's simplest form is a collection of nodes that collectively forma  linear sequence.
 * Each node stores a reference to an object that is an element of the sequence, as well as reference to the next node of the list
 * LinkedList must keep a reference to the head, without an explicit
 * tail has null as it's last reference
 * pointer hopping
 * Also a good idea to store a reference to the tail node, to avoid iterating the whole list
***/
public class SinglyLinkedList<E>{


    //Instance Variables for Singly Linked List

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    //Constructor
    public SinglyLinkedList(){};


    public int size()
    {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }



    //first method
    public E first(){
        if(isEmpty()) return null;
        return head.getElement();
    }

    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }






    public void addFirst(E element){
        head = new Node<>(element,head);
        if(size == 0){
            tail = head;
        }
        size++;
    }

    public void addLast(E e){
        Node<E> newest = new Node<>(e,null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
    }




    //internal class for Nodes
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;


        }

        public E getElement(){
            return element;

        }

        public void setNext(Node<E> n ){
            next = n;
        }
    }


}




// Omitted Method to remove Head as I couldn't figure it out :/
