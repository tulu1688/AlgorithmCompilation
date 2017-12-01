[Tries: Contact](https://www.hackerrank.com/challenges/ctci-contacts/problem)


***
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static class Node{
        public int count;
        public Node[] child;

        Node(){
            count = 0;
            child = new Node[26];
            Arrays.fill(child, null);
        }

        public void addContact(String contact){
            Node curNode = this;
            for (char c : contact.toCharArray()){
                int index = c - 'a';

                if (curNode.child[index] == null){
                    curNode.child[index] = new Node();
                }

                curNode.child[index].count ++;
                curNode = curNode.child[index];
            }
        }
    }
    
    public static void main(String[] args) {
        Node trie = new Node();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            
            if ("add".equals(op)) {
                trie.addContact(contact);
            } else if ("find".equals(op)) {
                Node finder = trie;
                for (char c : contact.toCharArray()){
                    int index = c - 'a';
                    if (finder != null)
                        finder = finder.child[index];
                }
                
                System.out.println((finder == null) ? 0 : finder.count );
            }
        }
    }
}
***