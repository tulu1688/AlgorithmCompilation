package com.tulu.utils;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;

public class RotationArrayUtilsTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void test__rotationArrayWithoutExtraMem() throws Exception{
        int[] array = new int[]{1,2,4,2,3,4,6,2};
        RotationArrayUtils.rotationArrayWithoutExtraMem(array,2);
        assertArrayEquals(new int[]{6,2,1,2,4,2,3,4},array);
    }

    @Test(expected = Exception.class)
    public void test__rotationArrayWithoutExtraMem__withNullInputArray__shouldThrowException() throws Exception{
        RotationArrayUtils.rotationArrayWithoutExtraMem(null,2);
        exception.expectMessage("Input array is null");
    }

    @Test(expected = Exception.class)
    public void test__rotationArrayWithoutExtraMem__withStepEqualZero__shouldThrowException() throws Exception{
        RotationArrayUtils.rotationArrayWithoutExtraMem(null,0);
        exception.expectMessage("Rotation step must be greater than 0");
    }

    @Test(expected = Exception.class)
    public void test__rotationArrayWithoutExtraMem__withNegativeStep__shouldThrowException() throws Exception{
        RotationArrayUtils.rotationArrayWithoutExtraMem(null,0);
        exception.expectMessage("Rotation step must be greater than 0");
    }

    @Test(expected = Exception.class)
    public void test__rotationArrayWithoutExtraMem__withArrayLengthSmallerThanStep__shouldThrowException() throws Exception{
        RotationArrayUtils.rotationArrayWithoutExtraMem(new int[]{1,2},3);
        exception.expectMessage("Input array length is smaller than rotation step");
    }
}
