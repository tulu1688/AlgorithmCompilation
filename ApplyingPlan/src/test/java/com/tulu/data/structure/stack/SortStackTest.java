package com.tulu.data.structure.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortStackTest {
    @Test
    public void test_shortStack(){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(7);
        stack.push(5);
        stack.push(9);
        stack.push(3);
        stack.push(100);

        Stack<Integer> response = SortStack.shortStack(stack);

        assertEquals(100,response.pop().intValue());
        assertEquals(9,response.pop().intValue());
        assertEquals(7,response.pop().intValue());
        assertEquals(5,response.pop().intValue());
        assertEquals(3,response.pop().intValue());
        assertEquals(2,response.pop().intValue());
        assertEquals(1,response.pop().intValue());
    }
}