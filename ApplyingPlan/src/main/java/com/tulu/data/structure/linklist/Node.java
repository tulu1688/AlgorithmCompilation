package com.tulu.data.structure.linklist;

public class Node {
    private Comparable data;
    private Node next;

    public Node(Comparable data) {
        this.data = data;
        this.next = null;
    }

    public Comparable getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
