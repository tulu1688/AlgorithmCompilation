package com.tulu.data.structure.stack;

import com.tulu.data.structure.model.Node;

public class Stack {
    Node top;

    public void push(Object value){
        Node pointer = top;
        top = new Node(value);
        top.setNext(pointer);
    }

    public Object pop(){
        if (top != null){
            Node pointer = top;
            top = top.getNext();
            return pointer.getData();
        }
        return null;
    }

    public Object peak(){
        return top;
    }
}
