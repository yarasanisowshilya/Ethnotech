package Collection.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.offer(2);
        q.add(3);
        q.offer(4);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q.element());
        System.out.println(q.peek());

        System.out.println(q);
        System.out.println(q.contains(3));
    }
}
