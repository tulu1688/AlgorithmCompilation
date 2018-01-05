package com.tulu.data.structure.array;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertEquals;

public class MaximumSumSubArrayTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void test__MaximumSumSubArray() throws Exception{
        int[] array = new int[] {4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
        int actualValue = MaximumSumSubArray.maximumSubSubArray(array);
        assertEquals(7, actualValue);
    }

    @Test
    public void test__MaximumSumSubArray__withNullInputArray__shouldThrowException() throws Exception{
        exception.expect(Exception.class);
        MaximumSumSubArray.maximumSubSubArray(null);
        exception.expectMessage("Input array is null");
    }

    @Test
    public void test__MaximumSumSubArray__withEmptyInputArray__shouldThrowException() throws Exception{
        exception.expect(Exception.class);
        MaximumSumSubArray.maximumSubSubArray(new int[]{});
        exception.expectMessage("Input array is empty");
    }
}
