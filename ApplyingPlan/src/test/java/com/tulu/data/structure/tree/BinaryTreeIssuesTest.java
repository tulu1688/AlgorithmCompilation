package com.tulu.data.structure.tree;

import com.tulu.data.structure.model.BinaryTreeNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeIssuesTest {
    @Test
    public void getHeight() throws Exception {
    }

    @Test
    public void isBalanceBinaryTree__firstApproach() throws Exception {
        assertFalse(BinaryTreeIssues.isBalanceBinaryTree(createNonBalancedBinaryTreeForTest()));
        assertTrue(BinaryTreeIssues.isBalanceBinaryTree(createBalancedBinaryTreeForTest()));
    }

    @Test
    public void isBalanceBinaryTree__secondApproach() throws Exception {
        assertFalse(BinaryTreeIssues.isBalanceBinaryTree2(createNonBalancedBinaryTreeForTest()));
        assertTrue(BinaryTreeIssues.isBalanceBinaryTree2(createBalancedBinaryTreeForTest()));
    }

    @Test
    public void test__getDTrees(){
        List<LinkedList> lists = BinaryTreeIssues.getLinklistOfDDepthTree(createBalancedBinaryTreeForTest());
        assertEquals(4, lists.size());
        assertArrayEquals(lists.get(0).toArray(),new Integer[]{50});
        assertArrayEquals(lists.get(1).toArray(),new Integer[]{35,76});
        assertArrayEquals(lists.get(2).toArray(),new Integer[]{23,37,72,85});
        assertArrayEquals(lists.get(3).toArray(),new Integer[]{16,27,40});
    }

    private BinaryTreeNode createNonBalancedBinaryTreeForTest(){
        BinaryTreeNode node1 = new BinaryTreeNode(27);
        BinaryTreeNode node2 = new BinaryTreeNode(35);
        node2.setLeftChild(node1);
        BinaryTreeNode node3 = new BinaryTreeNode(40);
        BinaryTreeNode node4 = new BinaryTreeNode(72);
        BinaryTreeNode node5 = new BinaryTreeNode(50);
        node5.setLeftChild(node3);
        node5.setRightChild(node4);
        BinaryTreeNode node6 = new BinaryTreeNode(37);
        node6.setLeftChild(node2);
        node6.setRightChild(node5);
        BinaryTreeNode node7 = new BinaryTreeNode(85);
        BinaryTreeNode node8 = new BinaryTreeNode(76);
        node8.setLeftChild(node6);
        node8.setRightChild(node7);
        BinaryTreeNode node9 = new BinaryTreeNode(16);
        BinaryTreeNode node10 = new BinaryTreeNode(23);
        node10.setLeftChild(node9);
        node10.setRightChild(node8);

        return node10;
    }

    private BinaryTreeNode createBalancedBinaryTreeForTest(){
        BinaryTreeNode node1 = new BinaryTreeNode(16);
        BinaryTreeNode node2 = new BinaryTreeNode(27);
        BinaryTreeNode node3 = new BinaryTreeNode(23);
        node3.setLeftChild(node1);
        node3.setRightChild(node2);
        BinaryTreeNode node4 = new BinaryTreeNode(40);
        BinaryTreeNode node5 = new BinaryTreeNode(37);
        node5.setRightChild(node4);
        BinaryTreeNode node6 = new BinaryTreeNode(35);
        node6.setLeftChild(node3);
        node6.setRightChild(node5);
        BinaryTreeNode node7 = new BinaryTreeNode(72);
        BinaryTreeNode node8 = new BinaryTreeNode(85);
        BinaryTreeNode node9 = new BinaryTreeNode(76);
        node9.setLeftChild(node7);
        node9.setRightChild(node8);
        BinaryTreeNode node10 = new BinaryTreeNode(50);
        node10.setLeftChild(node6);
        node10.setRightChild(node9);

        return node10;
    }

}