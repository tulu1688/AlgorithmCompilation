[Stack: balanced brackets](https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem)

***
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        Stack<Integer> stack = new Stack();
        
        for (char c : expression.toCharArray()) {
            int val = c - 'a';
            if (stack.isEmpty()) {
                stack.push(val);
            } else if (
                (val == (')' - 'a') && stack.peek() == ('(' - 'a')) ||
                (val == ('}' - 'a') && stack.peek() == ('{' - 'a')) ||
                (val == (']' - 'a') && stack.peek() == ('[' - 'a'))
            )
                stack.pop();
            else
                stack.push(val);
        }
        
        return stack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
***