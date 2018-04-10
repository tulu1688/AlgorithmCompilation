package com.tulu.data.structure.stack;

public class QueueByTwoStack<T> {
    Stack<T> memoStack = new Stack<T>();
    Stack<T> bufferStack = new Stack<T>();

    public void enqueue(T value) {
        memoStack.push(value);
    }

    public T dequeue(){
        while (memoStack.peak() != null)
            bufferStack.push(memoStack.pop());

        T ret = bufferStack.pop();

        while (bufferStack.peak() != null)
            memoStack.push(bufferStack.pop());

        return ret;
    }
}
