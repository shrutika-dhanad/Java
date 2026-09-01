

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> st1 = new HashSet<>();
        st1.add(10);
        st1.add(20);
        st1.add(30);
        st1.add(40);
        st1.add(50);

        System.out.println("ele of st1:" + st1);
        Set<Integer> st2 = new HashSet<>();

         st2.add(30);
        st2.add(40);
        st2.add(50);
        st2.add(60);
        st2.add(70);
        System.out.println("ele of st2:" + st2);

        st1.retainAll(st2);
        System.out.println("after ratain the ele:"+  st1);


    System.out.println(st2.containsAll(st1));
    // System.out.println(st1.containsAll(st2));




    }
}
