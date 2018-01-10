package com.tulu.data.structure.array;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertEquals;

public class MinJumpToReachEndTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void test__findMinJump__arrayHasOneElement__shouldThrowException() throws Exception{
        exception.expect(Exception.class);
        MinJumpToReachEnd.findMinJump(new int[]{1});
        exception.expectMessage("Invalid input array. Array length must be greater than 1");
    }

    @Test
    public void test__findMinJump__emptyInputArray__shouldThrowException() throws Exception{
        exception.expect(Exception.class);
        MinJumpToReachEnd.findMinJump(new int[]{});
        exception.expectMessage("Invalid input array. Array length must be greater than 1");
    }

    @Test
    public void test__findMinJump__inputArrayIsNull__shouldThrowException() throws Exception{
        exception.expect(Exception.class);
        MinJumpToReachEnd.findMinJump(null);
        exception.expectMessage("Input array is null");
    }

    @Test
    public void test__findMinJump__success() throws Exception{
        int[] array = new int[]{2,1,3,2,3,4,5,1,2,8};
        int steps = MinJumpToReachEnd.findMinJump(array);
        assertEquals(3,steps);
    }
}
