package com.tulu.data.structure.stack;

import com.tulu.data.structure.model.Node;

public class Stack<T> {
    private Node<T> top;
    private int size;

    public Stack() {
        this.size = 0;
    }

    public void push(T value){
        Node pointer = top;
        top = new Node(value);
        top.setNext(pointer);
        size++;
    }

    public T pop(){
        if (top != null){
            Node pointer = top;
            top = top.getNext();
            size--;
            return (T) pointer.getData();
        }
        return null;
    }

    public T peak(){
        if (top != null)
            return top.getData();
        return null;
    }

    public long size(){
        return size;
    }

    public boolean isEmpty(){
        return (size == 0) && (top == null);
    }
}
