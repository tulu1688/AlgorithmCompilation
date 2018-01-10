package com.tulu.data.structure.array;

import java.util.Stack;

/*
    https://www.youtube.com/watch?v=jH_5ypQggWg
 */
public class MinJumpToReachEnd {
    public static int findMinJump(int[] array) throws Exception{
        if (array == null)
            throw new Exception("Input array is null");
        if (array.length <= 1)
            throw new Exception("Invalid input array. Array length must be greater than 1");

        int[] minJumpArray = new int[array.length];
        minJumpArray[0] = 0;
        for (int i=1;i<array.length;i++){
            minJumpArray[i] = Integer.MAX_VALUE;
        }

        int[] jumpPathArray = new int[array.length];
        for (int i=0;i<array.length;i++){
            jumpPathArray[i] = 0;
        }

        for (int i=1;i<array.length;i++){
            for (int j=0;j<i;j++){
                if (i <= j + array[j]) {
                    if (minJumpArray[j] + 1 < minJumpArray[i]) {
                        jumpPathArray[i] = j;
                        minJumpArray[i] = minJumpArray[j] + 1;
                    }
                }
            }
        }

        Stack<Integer> jumpPath = new Stack<Integer>();
        int prevPosition = array.length - 1;
        while (prevPosition != 0){
            jumpPath.push(prevPosition);
            prevPosition = jumpPathArray[prevPosition];
        }

        StringBuilder jumpPathSb = new StringBuilder("0 -> ");
        while (!jumpPath.empty()){
            if (jumpPath.size() == 1)
                jumpPathSb.append(jumpPath.pop());
            else
                jumpPathSb.append(jumpPath.pop() + " -> ");
        }
        System.out.println(jumpPathSb.toString());

        return minJumpArray[array.length - 1];
    }
}
