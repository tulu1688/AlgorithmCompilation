package com.tulu.data.structure.stack;

import com.tulu.data.structure.model.Node;

public class SecondMinStack extends Stack{
    Stack<Comparable> minStack = new Stack();

    public void push(Comparable value){
        super.push(value);

        if (minStack.peak() == null) {
            minStack.push(value);
        } else {
            Comparable oldMin = (Comparable) minStack.peak().getData();
            if (value.compareTo(oldMin) < 0)
                minStack.push(value);
        }
    }

    public Comparable pop(){
        Comparable val = (Comparable) super.pop();

        if (val != null) {
            if (val.compareTo((Comparable) minStack.peak().getData()) == 0)
                minStack.pop();
        }

        return val;
    }

    public Comparable min(){
        if (minStack.peak() == null)
            return null;
        return (Comparable) minStack.peak().getData();
    }
}
