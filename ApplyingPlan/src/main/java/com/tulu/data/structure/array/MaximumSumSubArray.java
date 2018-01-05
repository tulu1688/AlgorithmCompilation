package com.tulu.data.structure.array;

/*
    https://www.youtube.com/watch?v=kekmCQXYwQ0
    Kadane's algorithm
 */

public class MaximumSumSubArray {
    public static int maximumSubSubArray(int[] array) throws Exception{
        if(array == null)
            throw new Exception("Input array is null");
        if(array.length == 0)
            throw new Exception("Input array is empty");

        int max_so_far = 0;
        int max_ending_here = 0;

        int start = 0;
        int end = 0;
        int s = 0;

        for (int index = 0; index < array.length; index ++) {
            max_ending_here += array[index];
            if (max_ending_here > max_so_far) {
                max_so_far = max_ending_here;

                start = s;
                end = index;
            }

            if (max_ending_here < 0) {
                max_ending_here = 0;

                s = index + 1;
            }
        }

        System.out.format("Maximum sub array [%d] from start index [%d] to end index [%d]", max_so_far, start, end);
        return max_so_far;
    }
}
