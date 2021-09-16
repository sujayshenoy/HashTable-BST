package com.yml.hashbstmain;

import com.yml.binarysearchtree.BinarySearchTree;
import com.yml.hashmap.HashMap;
import com.yml.hashmap.LinkedHashMap;

public class HashBstMain {
    public static void main(String args[]) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

        bst.add(56);
        bst.add(30);
        bst.add(70);

        bst.print();
    }
}
