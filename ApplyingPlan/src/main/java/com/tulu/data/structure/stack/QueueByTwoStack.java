package com.tulu.data.structure.stack;

public class QueueByTwoStack<T> {
    Stack<T> enqueueStack = new Stack<T>();
    Stack<T> dequeueStack = new Stack<T>();

    public void enqueue(T value) {
        enqueueStack.push(value);
    }

    public T dequeue(){
        if (dequeueStack.peak() == null)
            while (enqueueStack.peak() != null)
                dequeueStack.push(enqueueStack.pop());
        return dequeueStack.pop();
    }

    public long size(){
        return enqueueStack.size() + dequeueStack.size();
    }
}
