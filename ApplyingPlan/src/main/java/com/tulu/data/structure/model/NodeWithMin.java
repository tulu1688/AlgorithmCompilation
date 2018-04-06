package com.tulu.data.structure.model;

public class NodeWithMin {
    private Comparable data;
    private Comparable minValue;
    private NodeWithMin next;

    public NodeWithMin(Comparable value) {
        data = value;
        next = null;
    }

    public Comparable getData() {
        return data;
    }

    public Comparable getMinValue() {
        return minValue;
    }

    public void setMinValue(Comparable minValue) {
        this.minValue = minValue;
    }

    public NodeWithMin getNext() {
        return next;
    }

    public void setNext(NodeWithMin next) {
        this.next = next;
    }
}
