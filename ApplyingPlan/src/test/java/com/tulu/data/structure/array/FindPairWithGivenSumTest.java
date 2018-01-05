package com.tulu.data.structure.array;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertEquals;

/*
    https://www.youtube.com/watch?v=s1xA_K1JReo
 */
public class FindPairWithGivenSumTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void test__findPairsWithGivenSum() throws Exception{
        int[] array = new int[] {5,8,3,4,2,6,10,7,1,9};
        int actualPairCount = FindPairWithGivenSum.findPairsWithGivenSum(array, 11);
        assertEquals(5,actualPairCount);
    }

    @Test
    public void test__findPairsWithGivenSum__whenInputArrayIsNull__shouldThrowException() throws Exception{
        exception.expect(Exception.class);
        FindPairWithGivenSum.findPairsWithGivenSum(null,10);
        exception.expectMessage("Input array is null");
    }

    @Test
    public void test__findPairsWithGivenSum__whenInputArrayIsEmpty__shouldThrowException() throws Exception{
        exception.expect(Exception.class);
        FindPairWithGivenSum.findPairsWithGivenSum(new int[]{},10);
        exception.expectMessage("Input array is empty");
    }

}
