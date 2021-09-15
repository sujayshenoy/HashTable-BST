package com.yml.linkedlist;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<Node<T>> {
    private Node<T> head;
    private int size;
    
    public LinkedList() {
        head = null;
        size = 0;
    }

    public Node<T> getHead() {
        return head;
    }

    public void add(T data) {
        Node<T> newNode = new Node<T>(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }

        Node<T> temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T search(T data) {
        if (isEmpty()) {
            return null;
        }

        Node<T> temp = head;
        do {
            T dat = temp.getData();
            if (dat.equals(data)) {
                return dat;
            }
            temp = temp.getNext();
        } while (temp != null);

        return null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        }

        Iterator<Node<T>> itr = this.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next().getData() + "->");
        }
        System.out.println();
    }

    @Override
    public Iterator<Node<T>> iterator() {
        return new LinkedListIterator<T>(head);
    }
}

