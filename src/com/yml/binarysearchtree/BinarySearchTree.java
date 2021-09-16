package com.yml.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> {
    private BinaryNode<T> root;
    private int size;

    public BinarySearchTree(){
        root = null;
        size = 0;
    }

    private void addToTree(BinaryNode<T> node, T data) {
        BinaryNode<T> newNode = new BinaryNode<T>(data);

        if (root == null) {
            root = newNode;
            size++;
            return;
        }

        if (newNode.compareTo(node) > 0) {
            if (node.getRight() == null) {
                node.setRight(newNode);
                size++;
            } else {
                addToTree(node.getRight(), data);
            }
        } else {
            if (node.getLeft() == null) {
                node.setLeft(newNode);
                size++;
            } else {
                addToTree(node.getLeft(), data);
            }
        }
    }
    
    public void add(T data) {
        addToTree(root, data);
    }

    private void inOrderPrint(BinaryNode<T> node) {
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

    public int size() {
        return size;
    }

}
