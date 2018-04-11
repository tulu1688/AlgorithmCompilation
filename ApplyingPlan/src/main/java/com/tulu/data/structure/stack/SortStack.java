package com.tulu.data.structure.stack;

public class SortStack {
    public static Stack<Integer> shortStack(Stack<Integer> input){
        Stack<Integer> ret = new Stack<Integer>();
        Stack<Integer> buffer = new Stack<Integer>();

        while (input.peak() != null) {
            Integer min = null;
            long indexOfMinVal = input.size();
            long index = input.size();
            while (input.peak() != null) {
                Integer val = input.pop();
                index --;

                if (min == null || min.compareTo(val) > 0) {
                    min = val;
                    indexOfMinVal  = index;
                }

                buffer.push(val);
            }

            while (buffer.peak() != null){
                if (index != indexOfMinVal)
                    input.push(buffer.pop());
                else
                    buffer.pop();
                index++;
            }

            if (min != null)
                ret.push(min);
        }
        return ret;
    }
}
