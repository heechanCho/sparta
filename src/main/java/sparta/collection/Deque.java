package sparta.collection;

import java.util.ArrayDeque;

public class Deque {
    public static  void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(5);
        arrayDeque.addFirst(11);
        System.out.println(arrayDeque);

        arrayDeque.addLast(0);
        System.out.println(arrayDeque);

        arrayDeque.offerFirst(10);
        System.out.println(arrayDeque);

        arrayDeque.offerLast(-1);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());



        System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.removeLast());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());

        System.out.println("--------------");

        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());

        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.size());

        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
        System.out.println(arrayDeque.size());
    }
}
