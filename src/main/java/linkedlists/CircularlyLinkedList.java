package linkedlists;


/***
 * Think of using a CircularArray as storing a sequence of items in cyclic order; like a turn based role game
 * round robin scheduling is used on an OS to effectively share CPU
 * A process is given a short turn to execute, known as a time slice, but it is interrupted when the slice ends
 */
public class CircularlyLinkedList<E>{

    //Instance variables
    private Node<E> tail = null; // we store tail... but not head
    private int size = 0; // number of nodes in the list


    //cpnstructor
    public CircularlyLinkedList(){}

    public int size(){
        return size;
    }

    public boolean isEmpty(){
       return size == 0;
    }

    //returns but does not remove the first element
    public E first(){
        if(isEmpty()) return null;
        return tail.getNext().getElement();

    }

    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();

    }

    //update methods


    public void rotate() {   //rotate the first element to the back of the list
        if(tail != null){    //if empty, do nothing
            tail = tail.getNext();  //the old head becomes the new tail
        }
    }

    public void addFirst(E e){
        if(size == 0) {
            // not sure what this syntax is doing?
            tail = new Node<>(e,tail.getNext());
            tail.setNext(tail);
        }
        else {
            Node<E> newest = new Node<>(e,tail.getNext());
            tail.setNext(newest);
        }

    }
    public void addLast(E e){
        addFirst(e);
        tail = tail.getNext();
    }


    public E removeFirst(){
        if(isEmpty()) return null;
        Node<E> head = tail.getNext();
        if (head == tail) tail =null;
        else tail.setNext(head.getNext());
        size --;
        return head.getElement();
    }













    //Private Class representing elements in Circular Array
    private class Node<E>{
        private E element;
        private Node<E> next;


        private Node(E e,Node<E> n){
            element = e;
            next = n;
        }

        public E getElement(){
            return element;
        }

        public void setNext(Node<E> n ){
            next = n;
        }

        public Node<E> getNext(){
            return next;
        }
    }
}
