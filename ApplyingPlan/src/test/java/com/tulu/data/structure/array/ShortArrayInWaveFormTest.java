package com.tulu.data.structure.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ShortArrayInWaveFormTest {
    @Test
    public void test__shortArrayInWaveForm(){
        int[] arr1 = new int[]{5,3,12,2,6,10,7,9,8};
        ShortArrayInWaveForm.shortArrayInWaveForm(arr1);
        assertArrayEquals(arr1,new int[]{3,12,2,6,5,10,7,9,8});

        int[] arr2 = new int[]{2,1,3,4,20,30,6,5,8,50};
        ShortArrayInWaveForm.shortArrayInWaveForm(arr2);
        assertArrayEquals(arr2,new int[]{1,3,2,20,4,30,5,8,6,50});
    }
}
