package com.tulu.data.structure.model;

public class Node<T> {
    private T data;
    private Node next;

    public Node(T value) {
        data = value;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
