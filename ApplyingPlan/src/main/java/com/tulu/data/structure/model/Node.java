package com.tulu.data.structure.model;

public class Node {
    private Object data;
    private Node next;

    public Node(Object value) {
        data = value;
        next = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Comparable data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
