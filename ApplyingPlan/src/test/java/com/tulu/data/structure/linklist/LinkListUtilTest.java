package com.tulu.data.structure.linklist;

import com.tulu.data.structure.model.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkListUtilTest {
    @Test
    public void test__addLinkListNode(){
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        Node linkList = LinkListUtil.addNode(null, node1);
        linkList = LinkListUtil.addNode(linkList, node2);
        linkList = LinkListUtil.addNode(linkList, node3);

        assertEquals(1,linkList.getData());
        linkList = linkList.getNext();
        assertEquals(2,linkList.getData());
        linkList = linkList.getNext();
        assertEquals(3,linkList.getData());
    }

    @Test
    public void test__getNumberInLinkList(){
        Node root = LinkListUtil.getNumberInLinkList(20170504);

        long sum = 0;
        int exponent = 1;
        Node number = root;
        while (number != null) {
            sum += exponent * (Integer) number.getData();
            exponent *= 10;
            number = number.getNext();
        }

        assertEquals(20170504L,sum);
    }

    @Test
    public void test__circularLinkList(){
        Node node = new Node(3);
        Node root = LinkListUtil.addNode(null, new Node(1));
        root = LinkListUtil.addNode(root, new Node(2));
        root = LinkListUtil.addNode(root, node);
        root = LinkListUtil.addNode(root, new Node(4));
        root = LinkListUtil.addNode(root, new Node(5));
        root = LinkListUtil.addNode(root, node);

        assertEquals(node.getData(), LinkListUtil.findCircularLinkList(root).getData());
    }
}
