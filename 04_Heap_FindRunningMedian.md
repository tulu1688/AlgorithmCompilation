[Heaps: Find the Running Median](https://www.hackerrank.com/challenges/ctci-find-the-running-median/problem)

***
package com.tulu.hackerrank;

import java.util.Scanner;

public class FindTheRunningMean {
    private static float getMedian(int[] arr, int startIndex, int endIndex){
        if ((endIndex - startIndex) % 2 == 0) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            return (float) arr[middleIndex];
        } else {
            int leftMiddleIndex = startIndex + (endIndex - startIndex - 1) / 2;
            return (((float) arr[leftMiddleIndex]) + arr[leftMiddleIndex + 1]) / 2;
        }
    }

    private static void insertNumber(int addedValue, int[] arr, int index, int endIndex) {
        for (int i = endIndex - 1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = addedValue;
    }


    private static void addNumber(int addedValue, int[] arr, int startIndex, int endIndex, int maxIndex){
        if (endIndex == -1) {
            arr[0] = addedValue;
        } else if (startIndex == endIndex) {
            if (arr[startIndex] <= addedValue)
                insertNumber(addedValue, arr, startIndex + 1, maxIndex + 1);
            else
                insertNumber(addedValue, arr, startIndex, maxIndex + 1);
        } else {
            float median = getMedian(arr, startIndex, endIndex);
            int middle = startIndex + (endIndex - startIndex) / 2;

            if (middle == startIndex) {
                if (median <= addedValue)
                    addNumber(addedValue, arr, middle + 1, middle + 1, maxIndex);
                else
                    addNumber(addedValue, arr, middle, middle, maxIndex);
            } else if (addedValue < median) {
                addNumber(addedValue, arr, startIndex, middle, maxIndex);
            } else {
                addNumber(addedValue, arr, middle, endIndex, maxIndex);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] s = new int[n];

        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            addNumber(a[a_i], s, 0, a_i - 1, a_i);
            System.out.println(getMedian(s, 0, a_i));
        }
    }
}
***
