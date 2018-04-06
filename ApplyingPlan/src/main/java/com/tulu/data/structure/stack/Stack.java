package com.tulu.data.structure.stack;

import com.tulu.data.structure.model.Node;

public class Stack<T> {
    Node top;

    public void push(T value){
        Node pointer = top;
        top = new Node(value);
        top.setNext(pointer);
    }

    public T pop(){
        if (top != null){
            Node pointer = top;
            top = top.getNext();
            return (T) pointer.getData();
        }
        return null;
    }

    public Node peak(){
        return top;
    }
}
