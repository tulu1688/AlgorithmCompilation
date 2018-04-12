package com.tulu.data.structure.tree;

import com.tulu.data.structure.model.BinaryTreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeIssues {
    public static int getDepth(BinaryTreeNode node){
        if (node != null) {
            int leftHeight = 1 + getDepth(node.getLeftChild());
            int rightHeight = 1 + getDepth(node.getRightChild());
            return (leftHeight > rightHeight) ? leftHeight : rightHeight;
        }
        return 0;
    }

    public static boolean isBalanceBinaryTree(BinaryTreeNode node){
        if (node != null) {
            BinaryTreeNode leftChild = node.getLeftChild();
            if (leftChild != null && !isBalanceBinaryTree(leftChild))
                return false;
            BinaryTreeNode rightChild = node.getLeftChild();
            if (leftChild != null && !isBalanceBinaryTree(rightChild))
                return false;

            int leftHeight = 1 + getDepth(node.getLeftChild());
            int rightHeight = 1 + getDepth(node.getRightChild());
            if (Math.abs(leftHeight - rightHeight) > 1)
                return false;

            return true;
        }
        return false;
    }

    public static boolean isBalanceBinaryTree2(BinaryTreeNode node){
        if (node == null)
            return false;

        int maxDepth = maxDepth(node);
        int minDepth = minDepth(node);

        return (maxDepth - minDepth <= 1);
    }

    public static List<LinkedList> getLinklistOfDDepthTree(BinaryTreeNode root){
        List<LinkedList> lists = new LinkedList<LinkedList>();

        int depth = getDepth(root);
        for (int i=0;i<depth;i++)
            lists.add(new LinkedList());

        traverseChildAddToList(0, root, lists);

        return lists;
    }

    private static void traverseChildAddToList(int depth, BinaryTreeNode root, List<LinkedList> lists){
        if (root != null) {
            lists.get(depth).add(root.getData());

            if (root.getLeftChild() != null)
                traverseChildAddToList(depth + 1, root.getLeftChild(), lists);

            if (root.getRightChild() != null)
                traverseChildAddToList(depth + 1, root.getRightChild(), lists);
        }
    }

    private static int maxDepth(BinaryTreeNode node){
        if (node != null) {
            int maxLeft = maxDepth(node.getLeftChild());
            int maxRight = maxDepth(node.getRightChild());
            return 1 + ((maxLeft > maxRight) ? maxLeft : maxRight);
        }
        return 0;
    }

    private static int minDepth(BinaryTreeNode node){
        if (node != null) {
            int minLeft = minDepth(node.getLeftChild());
            int minRight = minDepth(node.getRightChild());
            return 1 + ((minLeft < minRight) ? minLeft : minRight);
        }
        return 0;
    }
}
