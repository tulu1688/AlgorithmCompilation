package com.tulu.data.structure.heap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MaxHeapTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void test__minHeap__empty(){
        MaxHeap heap = new MaxHeap();
        assertTrue(heap.isEmpty());

        heap.add(1);
        assertFalse(heap.isEmpty());
    }

    @Test
    public void test__addMaxHeap() throws Exception{
        MaxHeap heap = new MaxHeap();
        heap.add(10);
        heap.add(20);
        heap.add(5);
        heap.add(40);
        heap.add(1);
        assertEquals(40,heap.poll());
        assertEquals(20,heap.poll());
        assertEquals(10,heap.poll());
        assertEquals(5,heap.poll());
        assertEquals(1,heap.poll());
        assertTrue(heap.isEmpty());
    }

    @Test
    public void test__poll__emptyHeap__shouldThrowException() throws Exception{
        MaxHeap heap = new MaxHeap();

        exception.expect(Exception.class);
        heap.poll();

        exception.expectMessage("heap is empty");
    }
}
