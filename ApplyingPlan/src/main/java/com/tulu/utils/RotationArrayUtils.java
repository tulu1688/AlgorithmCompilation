package com.tulu.utils;

public class RotationArrayUtils {
    public static void rotationArrayWithoutExtraMem(int[] array,int step) throws Exception{
        if (step <= 0)
            throw new Exception("Rotation step must be greater than 0");

        if (array == null)
            throw new Exception("Input array is null");

        if (array.length < step)
            throw new Exception("Input array length is smaller than rotation step");

        int start = 0;
        int end = array.length - step - 1;
        while (start < end) {
            SwapUtils.swapWithoutUsingTemp(array,start++,end--);
        }

        start = array.length - step;
        end = array.length - 1;
        while (start < end) {
            SwapUtils.swapWithoutUsingTemp(array,start++,end--);
        }

        start = 0;
        end = array.length - 1;
        while (start < end) {
            SwapUtils.swapWithoutUsingTemp(array,start++,end--);
        }
    }
}
