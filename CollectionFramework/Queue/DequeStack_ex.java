
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStack_ex {
    public static void main(String[] args) {
         Deque<Integer> stack = new ArrayDeque<>();

         stack.push(20);
         stack.push(50);
         stack.push(100);
    
       System.out.println(stack);

       stack.pop();
       System.out.println(stack);
    }
}
