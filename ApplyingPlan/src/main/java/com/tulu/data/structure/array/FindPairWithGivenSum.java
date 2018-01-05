package com.tulu.data.structure.array;

import java.util.Arrays;

/*
    https://www.youtube.com/watch?v=s1xA_K1JReo
 */
public class FindPairWithGivenSum {
    public static int findPairsWithGivenSum(int[] array, int sum) throws Exception{
        if (array == null)
            throw new Exception("Input array is null");
        if (array.length == 0)
            throw new Exception("Input array is empty");

        int count = 0;
        int start = 0;
        int end = array.length - 1;

        Arrays.sort(array);

        while (start < end){
            int cmpSum = array[start] + array[end];
            if (cmpSum > sum) {
                end --;
            } else if (cmpSum < sum) {
                start ++;
            } else {
                count++;
                System.out.format("Found a pair of number: [%d, %d]\n",array[start],array[end]);
                end --;
            }
        }
        return count;
    }
}
