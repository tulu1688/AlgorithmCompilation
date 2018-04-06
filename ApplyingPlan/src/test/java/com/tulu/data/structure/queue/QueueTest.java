package com.tulu.data.structure.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void test__addQueue(){
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1,queue.dequeue().getData());
        assertEquals(2,queue.dequeue().getData());
        assertNull(queue.dequeue());
    }

    @Test
    public void test__deQueue(){
        Queue queue = new Queue();
        assertNull(queue.dequeue());

        queue.enqueue(100);
        assertEquals(100, queue.dequeue().getData());
        assertNull(queue.dequeue());
    }
}