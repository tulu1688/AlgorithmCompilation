package com.tulu.data.structure.array;

import com.tulu.utils.SwapUtils;

/*
    Segregate 0's, 1's and 2's together in an array[O(n)] (Dutch National Flag Problem)
    https://www.youtube.com/watch?v=BOt1DAvR0zI
 */
public class DutchNationalFlagProblem {
    public static void segregate(int[] array) throws Exception {
        if (array == null)
            throw new Exception("Input array is null");

        int start = 0;
        int end = array.length - 1;
        int mid = 0;
        while (mid <= end) {
            switch (array[mid]) {
                case 0:
                    if (mid != start)
                        SwapUtils.swapWithoutUsingTemp(array, start, mid);

                    mid++;
                    start++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    if (mid != end)
                        SwapUtils.swapWithoutUsingTemp(array, end, mid);

                    end--;
                    break;
                default:
                    throw new Exception("Invalid array. The array only contains 0,1,2 values");
            }
        }
    }
}
