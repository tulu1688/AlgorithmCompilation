package com.tulu.data.structure.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MinStackTest {
    @Test
    public void test_minStack(){
        MinStack minStack = new MinStack();
        minStack.push(1000);
        minStack.push(10001);
        minStack.push(2);
        minStack.push(5);
        minStack.push(2017);
        minStack.push(6);
        minStack.push(4);

        assertEquals(2,minStack.min());
        assertEquals(4,minStack.pop());
        assertEquals(2,minStack.min());
        assertEquals(6,minStack.pop());
        assertEquals(2,minStack.min());
        assertEquals(2017,minStack.pop());
        assertEquals(2,minStack.min());
        assertEquals(5,minStack.pop());
        assertEquals(2,minStack.min());
        assertEquals(2,minStack.pop());
        assertEquals(1000,minStack.min());
        assertEquals(10001,minStack.pop());
        assertEquals(1000,minStack.min());
        assertEquals(1000,minStack.pop());
        assertNull(minStack.pop());
    }
}