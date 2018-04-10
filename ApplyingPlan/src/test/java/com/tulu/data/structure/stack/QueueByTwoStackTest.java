package com.tulu.data.structure.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class QueueByTwoStackTest {
    @Test
    public void test__enqueue(){
        QueueByTwoStack queue = new QueueByTwoStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(10);

        assertEquals(1,queue.dequeue());
        assertEquals(2,queue.dequeue());
        assertEquals(10,queue.dequeue());
        assertNull(queue.dequeue());
    }

    @Test
    public void test__dequeue(){
        QueueByTwoStack queue = new QueueByTwoStack();
        assertNull(queue.dequeue());

        queue.enqueue(100);
        assertEquals(100, queue.dequeue());
        assertNull(queue.dequeue());
    }
}