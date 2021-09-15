package com.yml.linkedlist;

import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<Node<T>> {
    Node<T> current;

    LinkedListIterator(Node<T> head){
        this.current = head;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node<T> next() {
        Node<T> temp = current;
        current = current.getNext();
        return temp;
    }
    
}
