package com.tulu.hackerrank;

import com.tulu.data.structure.heap.MaxHeap;
import com.tulu.data.structure.heap.MinHeap;

import java.util.Scanner;

public class FindTheRunningMeanWithHeap {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        MinHeap minHeap = new MinHeap();
        MaxHeap maxHeap = new MaxHeap();

        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
            maxHeap.add(a[a_i]);

            if (a_i % 2 == 1)
                minHeap.add(maxHeap.poll());

            if (a_i % 2 == 0)
                System.out.println((float)maxHeap.peek());
            else
                System.out.println((float)(maxHeap.peek() + minHeap.peek())/2);
        }
    }
}
