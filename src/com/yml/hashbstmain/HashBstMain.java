package com.yml.hashbstmain;

import com.yml.binarysearchtree.BinarySearchTree;

public class HashBstMain {
    public static void main(String args[]) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(63);
        System.out.println("Size of the tree : "+bst.size());
        bst.print();

        if (bst.search(63)) {
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }
}
