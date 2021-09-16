package com.yml.binarysearchtree;

public class BinaryNode<T extends Comparable<T>> implements Comparable<BinaryNode<T>> {
    T data;
    BinaryNode<T> left;
    BinaryNode<T> right;

    BinaryNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }

    @Override
    public int compareTo(BinaryNode<T> o) {
        return this.data.compareTo(o.data);
    }
    
}
