package com.tulu.utils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;

public class ReverseArrayUtilsTest {
    @Rule
    public static ExpectedException exception = ExpectedException.none();

    @Test
    public void test__reverseArrayWithoutMemSwap() throws Exception{
        int[] arr1 = new int[]{8,7,6,5,4,3,2,1};
        ReverseArrayUtils.reverseArrayWithoutMemSwap(arr1);
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8},arr1);

        int[] arr2 = new int[]{1,2,3,4,5,6,7};
        ReverseArrayUtils.reverseArrayWithoutMemSwap(arr2);
        assertArrayEquals(new int[]{7,6,5,4,3,2,1},arr2);
    }

    @Test(expected = Exception.class)
    public void test__reverseArrayWithoutMemSwap__emptyInputArray__shouldThrowException() throws Exception{
        ReverseArrayUtils.reverseArrayWithoutMemSwap(new int[]{});

        exception.expectMessage("empty array");
    }

    @Test(expected = Exception.class)
    public void test__reverseArrayWithoutMemSwap__inputArrayIsNull__shouldThrowException() throws Exception{
        ReverseArrayUtils.reverseArrayWithoutMemSwap(null);

        exception.expectMessage("input array is null");
    }
}
