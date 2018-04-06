package com.tulu.data.structure.linklist;

import com.tulu.data.structure.model.Node;

import java.util.HashMap;

public class LinkListUtil {
    public static Node addNode(Node root, Node node){
        Node pointer = root;
        if (pointer == null)
            return node;

        while (pointer.getNext() != null)
            pointer = pointer.getNext();
        pointer.setNext(node);

        return root;
    }

    public static Node getNumberInLinkList(int val) {
        int n = val;
        Node node = null;

        while (n > 0) {
            int digit = n % 10;
            node = LinkListUtil.addNode(node, new Node(digit));
            n = n / 10;
        }

        return node;
    }

    public static long getNumberValue(Node root){
        long sum = 0;
        int exponent = 1;
        Node number = root;
        while (number != null) {
            sum += exponent * (Integer) number.getData();
            exponent *= 10;
            number = number.getNext();
        }
        return sum;
    }

    public static Node findCircularLinkList(Node root){
        HashMap<Object, Node> hashMap = new HashMap<Object, Node>();
        Node pointer = root;

        while (pointer != null){
            if (hashMap.containsKey(pointer.getData()))
                return pointer;
            hashMap.put(pointer.getData(), pointer);
            pointer = pointer.getNext();
        }

        return null;
    }
}
