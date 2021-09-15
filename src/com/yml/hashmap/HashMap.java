package com.yml.hashmap;

import com.yml.linkedlist.LinkedList;

public class HashMap<K,V> {
    LinkedList<MyMapNode<K,V>> linkedList;

    public HashMap() {
        linkedList = new LinkedList<MyMapNode<K,V>>();
    }

    public void add(K key, V value) {
        MyMapNode<K, V> newMapNode = new MyMapNode<K, V>(key, value);
        MyMapNode<K,V> searchNode = linkedList.search(newMapNode);
        if (searchNode == null) {
            linkedList.add(newMapNode);
        } else {
            searchNode.setValue(value);
        }
    }
    
    public V get(K key) {
        MyMapNode<K,V> keyNode = new MyMapNode<K,V>(key, null);
        MyMapNode<K, V> searchNode = linkedList.search(keyNode);
        if (searchNode == null) {
            return null;
        }
        else {
            return searchNode.getValue();
        }
    }

    public void print() {
        linkedList.print();
    }
}
