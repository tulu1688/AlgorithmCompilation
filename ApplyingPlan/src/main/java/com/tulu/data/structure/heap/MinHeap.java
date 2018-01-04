package com.tulu.data.structure.heap;

import com.tulu.utils.SwapUtils;

import java.util.Arrays;

public class MinHeap {
    private static final int HEAP_MEM_BULK = 100;

    private int heapSize = 0;
    int[] array = new int[HEAP_MEM_BULK];

    public int poll() throws Exception{
        if (heapSize == 0)
            throw new Exception("heap is empty");
        int ret = array[0];

        if (heapSize > 1)
            SwapUtils.swapWithoutUsingTemp(array,0,heapSize-1);

        heapSize--;
        heapifyDown(0);
        return ret;
    }

    public void add(int value){
        if (heapSize == array.length)
            increaseHeapMemo();
        array[heapSize] = value;
        heapifyUp(heapSize++);
    }

    public boolean isEmpty(){
        return heapSize == 0;
    }

    private void heapifyUp(int index){
        int nextIndex = index;
        while (nextIndex > 0 && array[nextIndex] < array[getParentIndex(nextIndex)]) {
            SwapUtils.swapWithoutUsingTemp(array, nextIndex, getParentIndex(nextIndex));
            nextIndex = getParentIndex(nextIndex);
        }
    }

    private void heapifyDown(int index){
        int nextIndex = index;

        while (nextIndex < heapSize){
            if (!hasLeftChild(nextIndex))
                break;

            int smallerChildIndex = getLeftChildIndex(nextIndex);
            if (hasRightChild(nextIndex) && array[getLeftChildIndex(nextIndex)] > array[getRightChildIndex(nextIndex)])
                smallerChildIndex = getRightChildIndex(nextIndex);

            if (array[nextIndex] > array[smallerChildIndex]) {
                SwapUtils.swapWithoutUsingTemp(array,nextIndex,smallerChildIndex);
                nextIndex = smallerChildIndex;
            } else break;
        }
    }

    private int getParentIndex(int index){
        return index / 2;
    }

    private int getLeftChildIndex(int index){
        return index * 2 + 1;
    }

    private int getRightChildIndex(int index){
        return index * 2 + 2;
    }

    private int getValueAtIndex(int index){
        return array[index];
    }

    private boolean hasLeftChild(int index){
        return (index * 2 + 1) < heapSize;
    }

    private boolean hasRightChild(int index){
        return (index * 2 + 2) < heapSize;
    }

    private void increaseHeapMemo(){
        array = Arrays.copyOf(array, heapSize + HEAP_MEM_BULK);
    }
}
