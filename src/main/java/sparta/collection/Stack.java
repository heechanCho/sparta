package sparta.collection;

import java.util.*;

public class Stack {
    public static void main(String[] args) {

      java.util.Stack<Integer> stack = new java.util.Stack<>();

      stack.push(1);
      stack.push(2);
      stack.push(4);
      stack.push(8);

      System.out.println(stack);

      System.out.println(stack.peek());
      System.out.println("size ==> " + stack.size());
      System.out.println(stack.pop());
      System.out.println("size ==> " + stack.size());

      System.out.println(stack.contains(3));
      System.out.println(stack.empty());
      stack.clear();
      System.out.println(stack.empty());
    }
}
