import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx_one {

    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.offer(20);
        dq.offer(30);
        dq.offer(40);
        dq.offer(50);

        System.out.println(dq);

        dq.addFirst(100);
        dq.addLast(850);

        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq.contains(50));

    }
}
