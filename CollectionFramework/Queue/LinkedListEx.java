import java.util.Queue;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // normal queue mdhe insertion always rear se hoil and removela from the front

        // q.add(10);
        // System.out.println(q);
        // q.offer(120);
        // System.out.println(q);
        // q.offer(null);
        // System.out.println(q);

        // System.out.println(q.element()); //throw exception when no element is presetn

        System.out.println(q.peek()); // return null if no ele is presetn.
        // System.out.println();

        q.offer(10);
        q.offer(110);

        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println(q);

        q.remove(); // throw exception when no ele is present.

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);

    }
}
