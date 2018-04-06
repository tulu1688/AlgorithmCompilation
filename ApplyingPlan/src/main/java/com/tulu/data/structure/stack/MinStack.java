package com.tulu.data.structure.stack;

import com.tulu.data.structure.model.NodeWithMin;

public class MinStack extends Stack{
    NodeWithMin top;

    public void push(Comparable value){
        NodeWithMin pointer = top;

        top = new NodeWithMin(value);
        if (pointer == null){
            top.setMinValue(value);
        } else {
            Comparable oldMin = pointer.getMinValue();
            if (value.compareTo(oldMin) < 0)
                top.setMinValue(value);
            else
                top.setMinValue(oldMin);
        }

        top.setNext(pointer);
    }

    public Object pop(){
        if (top != null){
            NodeWithMin pointer = top;
            top = top.getNext();
            return pointer.getData();
        }
        return null;
    }

    public Comparable min(){
        return top.getMinValue();
    }
}
