[Trees: Is This a Binary Search Tree?](https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem)

***
/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    int getMaxNodeVal(Node node){
        Node visitor = node;
        while (visitor.right != null)
            visitor = visitor.right;
        return visitor.data;
    }

    int getMinNodeVal(Node node){
        Node visitor = node;
        while (visitor.left != null)
            visitor = visitor.left;
        return visitor.data;        
    }

    boolean checkBST(Node root) {
        Node left = root.left;
        Node right = root.right;
        
        if (right != null) {
            int minRightNode = getMinNodeVal(root.right);
            if (minRightNode <= root.data)
                return false;
        }
        
        if (left != null) {
            int maxLeftNode = getMaxNodeVal(root.left);
            if (maxLeftNode >= root.data)
                return false;
        }

        if (left != null && !checkBST(left))
            return false;
        if (right != null && !checkBST(right))
            return false;
        return true;
    }
***