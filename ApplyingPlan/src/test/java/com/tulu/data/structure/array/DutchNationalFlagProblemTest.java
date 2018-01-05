package com.tulu.data.structure.array;

import com.tulu.utils.SwapUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertArrayEquals;

public class DutchNationalFlagProblemTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void test__segregate__success() throws Exception{
        int[] arr = new int[]{0,1,0,2,0,1,2,0,0,1};
        DutchNationalFlagProblem.segregate(arr);
        assertArrayEquals(new int[]{0,0,0,0,0,1,1,1,2,2}, arr);
    }

    @Test(expected = Exception.class)
    public void test__segregate__withEmptyInputArray__shouldThrowException() throws Exception{
        DutchNationalFlagProblem.segregate(null);
        exception.expectMessage("Input array is null");
    }

    @Test
    public void test__segregate__withInvalidArray__shouldThrowException() throws Exception{
        exception.expect(Exception.class);

        DutchNationalFlagProblem.segregate(new int[]{0,1,2,4,0,2,1});

        exception.expectMessage("Invalid array. The array only contains 0,1,2 values");
    }
}
