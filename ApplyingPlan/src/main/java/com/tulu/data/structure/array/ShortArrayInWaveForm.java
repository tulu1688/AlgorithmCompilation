package com.tulu.data.structure.array;

import com.tulu.utils.SwapUtils;

/*
    https://www.youtube.com/watch?v=U_Jz-v4_Tms
 */
public class ShortArrayInWaveForm {
    public static final void shortArrayInWaveForm(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            if (i%2==0){
                if (arrays[i] > arrays[i+1])
                    SwapUtils.swapWithoutUsingTemp(arrays,i,i+1);
            } else {
                if (arrays[i] < arrays[i+1])
                    SwapUtils.swapWithoutUsingTemp(arrays,i,i+1);
            }
        }
    }
}
