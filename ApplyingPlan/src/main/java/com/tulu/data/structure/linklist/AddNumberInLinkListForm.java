package com.tulu.data.structure.linklist;

import com.tulu.data.structure.model.Node;

public class AddNumberInLinkListForm {
    public static Node addNumber(Node number1, Node number2){
        int carry = 0;
        Node firstPointer = number1;
        Node secondPointer = number2;
        Node sum = null;

        while (firstPointer != null || secondPointer != null){
            int a = (firstPointer == null) ? 0 : (Integer) firstPointer.getData();
            int b = (secondPointer == null) ? 0 : (Integer) secondPointer.getData();
            int s = a + b + carry;
            int c = s % 10;
            carry = s / 10;

            sum = LinkListUtil.addNode(sum, new Node(c));

            if (firstPointer != null)
                firstPointer = firstPointer.getNext();
            if (secondPointer != null)
                secondPointer = secondPointer.getNext();
        }

        if (carry > 0)
            sum = LinkListUtil.addNode(sum, new Node(carry));

        return sum;
    }
}
