import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeEx {
    public static void main(String[] args) {
        Deque<String> dq = new LinkedList<>();
        dq.add("shrutika");
        dq.add("pritesh");
        dq.add("vaibhavii");
        dq.add("Raj");
        dq.add("Aditya");
        dq.add("tejashri");

        System.out.println(dq);

        dq.addFirst("neha");
        dq.addLast("priyansh");

        System.out.println(dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println(dq);

        dq.offerLast("snehaa");
        System.out.println(dq);

        System.out.println(dq.element());

        dq.pollFirst();
        System.out.println(dq);


         Iterator<String> itr = dq.iterator();
        while (itr.hasNext()) {
            System.out.println("elements :" + itr.next());
        }
        
    
    
    }
}
