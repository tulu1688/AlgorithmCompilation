package com.tulu.utils;

/*
    https://www.youtube.com/watch?v=Msr4Z8m6Q_c&t=8s
 */

public class SwapUtils {
    public static final void swapWithoutUsingTemp(int[] array, int x, int y) {
        array[x] = array[x] ^ array[y];
        array[y] = array[x] ^ array[y];
        array[x] = array[x] ^ array[y];
    }

    public static final void swapWithoutUsingTemp(float[] array, int x, int y) {
        array[x] = array[x] + array[y];
        array[y] = array[x] - array[y];
        array[x] = array[x] - array[y];
    }
}
