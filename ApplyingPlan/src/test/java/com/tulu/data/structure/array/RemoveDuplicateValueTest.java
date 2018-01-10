package com.tulu.data.structure.array;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;

public class RemoveDuplicateValueTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void test__removeDuplicateValues() throws Exception{
        int[] arr = new int[]{1,1,2,2};
        RemoveDuplicateValue.removeDuplicateValues(arr);
        assertArrayEquals(new int[]{1,2,0,0},arr);

        int[] arr1 = new int[]{1,1,2,2,3,3};
        RemoveDuplicateValue.removeDuplicateValues(arr1);
        assertArrayEquals(new int[]{1,2,3,0,0,0},arr1);

        int[] arr2 = new int[]{1,1,2,2,3,3,4,4,4,1,2,2,3,3,3};
        RemoveDuplicateValue.removeDuplicateValues(arr2);
        assertArrayEquals(new int[]{1,2,3,4,1,2,3,0,0,0,0,0,0,0,0},arr2);

        int[] arr3 = new int[]{1,2,3,4};
        RemoveDuplicateValue.removeDuplicateValues(arr3);
        assertArrayEquals(new int[]{1,2,3,4},arr3);

        int[] arr4 = new int[]{1,1,1,1};
        RemoveDuplicateValue.removeDuplicateValues(arr4);
        assertArrayEquals(new int[]{1,0,0,0},arr4);
    }

    @Test
    public void test__removeDuplicateValues__NullInputArray() throws Exception{
        exception.expect(Exception.class);
        RemoveDuplicateValue.removeDuplicateValues(null);
        exception.expectMessage("Input array is null");
    }

    @Test
    public void test__removeDuplicateValues__EmptyInputArray() throws Exception{
        exception.expect(Exception.class);
        RemoveDuplicateValue.removeDuplicateValues(new int[]{});
        exception.expectMessage("Empty input array");
    }
}
