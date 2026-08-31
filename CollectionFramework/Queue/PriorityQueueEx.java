import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        // Queue<Integer> pq = new PriorityQueue<>();

        // pq.offer(30);
        // pq.offer(10);
        // pq.offer(20);
        // pq.offer(50);
        // pq.offer(60);

        // System.out.println("ele: " + pq);

        // System.out.println(pq.poll());

        // System.out.println("ele: " + pq);

        
        // System.out.println(pq.poll());

        // System.out.println("ele: " + pq);
        
        // System.out.println(pq.poll());

        // System.out.println("ele: " + pq);

        //*********************coverting into max-heap  */
    
     Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(50);
        pq.offer(60);

        System.out.println("ele: " + pq);

        System.out.println(pq.poll());

        System.out.println("ele: " + pq);

        
        System.out.println(pq.poll());

        System.out.println("ele: " + pq);
        
        System.out.println(pq.poll());

        System.out.println("ele: " + pq);

             
        System.out.println(pq.poll());

        System.out.println("ele: " + pq);

         
        System.out.println(pq.poll());

        System.out.println("ele: " + pq);

        
        System.out.println(pq.size());

        System.out.println(pq.peek());
        // System.out.println(pq.element());

    
         
         System.out.println(pq.isEmpty());
    }

}
