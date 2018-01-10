package com.tulu.data.structure.array;

public class RemoveDuplicateValue {
    public static int removeDuplicateValues(int[] array) throws Exception{
        if (array == null)
            throw new Exception("Input array is null");
        if (array.length < 1)
            throw new Exception("Empty input array");
        if (array.length == 1)
            return 1;

        int tail = 0;
        int arrayNewLen = 1;

        for (int index = 1; index < array.length; index ++) {
            if (array[tail] != array[index]) {
                tail ++;
                array[tail] = array[index];
                arrayNewLen++;
            }
        }

        for (int i = arrayNewLen; i< array.length; i++)
            array[i] = 0;

        return arrayNewLen;
    }
}
