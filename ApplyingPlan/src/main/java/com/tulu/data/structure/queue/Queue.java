package com.tulu.data.structure.queue;

import com.tulu.data.structure.model.Node;

public class Queue {
    Node head, tail;

    public void enqueue(Object data){
        Node newItem = new Node(data);
        if (tail == null) {
            head = tail = newItem;
        } else {
            tail.setNext(newItem);
            tail = tail.getNext();
        }
    }

    public Node dequeue(){
        if (head == null) {
            return null;
        } else {
            Node pointer = head;
            head = head.getNext();

            if (head == null)
                tail = null;

            return pointer;
        }
    }

    public Node peak(){
        return head;
    }
}
