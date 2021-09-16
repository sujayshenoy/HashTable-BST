package com.yml.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> {
    BinaryNode<T> root;

    public void addToTree(BinaryNode<T> node, T data) {
        BinaryNode<T> newNode = new BinaryNode<T>(data);

        if (root == null) {
            root = newNode;
            return;
        }

        if (newNode.compareTo(node) > 0) {
            if (node.getRight() == null) {
                node.setRight(newNode);
            } else {
                addToTree(node.getRight(), data);
            }
        } else {
            if (node.getLeft() == null) {
                node.setLeft(newNode);
            } else {
                addToTree(node.getLeft(), data);
            }
        }
    }
    
    public void add(T data) {
        addToTree(root, data);
    }

    public void inOrderPrint(BinaryNode<T> node) {
        if (node == null)
            return;

        inOrderPrint(node.getLeft());
        System.out.println(node.getData());
        inOrderPrint(node.getRight());
    }
    
    public void print() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
        inOrderPrint(root);
    }

    public BinaryNode<T> getRoot() {
        return root;
    }

}
