package com.tulu.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwapUtilsTest {
    @Test
    public void test__swapWithoutUsingTemp__IntegerValue__allPositiveValue(){
        int array[] = new int[] {1,2};
        SwapUtils.swapWithoutUsingTemp(array,0,1);
        assertEquals(array[0],2);
        assertEquals(array[1],1);
    }

    @Test
    public void test__swapWithoutUsingTemp__IntegerValue__hasNegativeValue(){
        int array[] = new int[] {1,-12};
        SwapUtils.swapWithoutUsingTemp(array,0,1);
        assertEquals(array[0],-12);
        assertEquals(array[1],1);
    }

    @Test
    public void test__swapWithoutUsingTemp__FloatValue__allPositiveValue(){
        float array[] = new float[] {1f,2f};
        SwapUtils.swapWithoutUsingTemp(array,0,1);
        assertEquals(array[0],2f,0.00001);
        assertEquals(array[1],1f,0.00001);
    }
}
