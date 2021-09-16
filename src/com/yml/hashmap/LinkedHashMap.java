package com.yml.hashmap;

import java.util.ArrayList;

import com.yml.linkedlist.LinkedList;

public class LinkedHashMap<K,V> {
    ArrayList<LinkedList<MyMapNode<K,V>>> bucketArray;
    int bucketSize = 10;

    public LinkedHashMap() {
        bucketArray = new ArrayList<LinkedList<MyMapNode<K,V>>>(bucketSize);

        for (int i = 0; i < bucketSize; i++) {
            bucketArray.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % bucketSize;
        return index;
    }
    
    public void add(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MyMapNode<K, V> newMapNode = new MyMapNode<K, V>(key, value);
        LinkedList<MyMapNode<K, V>> list = bucketArray.get(bucketIndex);
        if (list == null) {
            list = new LinkedList<MyMapNode<K, V>>();
            list.add(newMapNode);
            bucketArray.set(bucketIndex, list);
            return;
        }

        MyMapNode<K, V> searchNode = list.search(newMapNode);
        if (searchNode == null) {
            list.add(newMapNode);
        } else {
            searchNode.setValue(value);
        }

    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<MyMapNode<K, V>> linkedList = bucketArray.get(bucketIndex);
        if (linkedList == null) {
            return null;
        }

        MyMapNode<K,V> keyNode = new MyMapNode<K,V>(key, null);
        MyMapNode<K, V> searchNode = linkedList.search(keyNode);
        if (searchNode == null) {
            return null;
        }
        else {
            return searchNode.getValue();
        }
    }
    
    public void printLinkedHashMap() {
        for (LinkedList<MyMapNode<K, V>> list : bucketArray) {
            if (list == null) {
                continue;
            }
            System.out.print("Bucket : ");
            list.print();
        }
    }
}
