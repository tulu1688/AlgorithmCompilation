package com.tulu.utils;

public class ReverseArrayUtils {
    public static void reverseArrayWithoutMemSwap(int[] array) throws Exception{
        if (array == null)
            throw new Exception("input array is null");
        if (array.length <= 0)
            throw new Exception("empty array");

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            SwapUtils.swapWithoutUsingTemp(array, start++,end--);
        }
    }
}
