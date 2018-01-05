package com.tulu.data.structure.heap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MinHeapTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void test__minHeap__empty(){
        MinHeap heap = new MinHeap();
        assertTrue(heap.isEmpty());

        heap.add(1);
        assertFalse(heap.isEmpty());
    }

    @Test
    public void test__addMinHeap() throws Exception{
        MinHeap heap = new MinHeap();
        heap.add(10);
        heap.add(20);
        heap.add(5);
        heap.add(40);
        heap.add(1);
        assertEquals(1,heap.poll());
        assertEquals(5,heap.poll());
        assertEquals(10,heap.poll());
        assertEquals(20,heap.poll());
        assertEquals(40,heap.poll());
        assertTrue(heap.isEmpty());
    }

    @Test
    public void test__poll__emptyHeap__shouldThrowException() throws Exception{
        MinHeap heap = new MinHeap();

        exception.expect(Exception.class);
        heap.poll();

        exception.expectMessage("heap is empty");
    }
}
