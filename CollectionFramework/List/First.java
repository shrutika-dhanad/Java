import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class First {
    public static void main(String[] args) {
        // Arrylist - it is used to implement the functionality of resizable-arrays. it
        // implements the list interface of the collection framework.
        // Maintains insertion order
        // Allows duplicates
        // Allows multiple null values
        // Fast random access
        // Dynamic/resizable
        // Not synchronized
        // ArrayList indexing
        // ArrayList<String> names = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();

        // List<Integer> list = new ArrayList<>(); we can also create the referece of
        // collection and list but create the obj of concrete class.
        // Collection list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(50);

        System.out.println(list);

        list.add(40);
        list.add(60);
        System.out.println(list);

        // remove()

        list.remove(1);
        System.out.println(list);

        // addAll()

        List<Integer> list2 = new ArrayList<>();
        list2.add(200);
        list2.add(400);

        list.addAll(list2);

        System.out.println(list);

        // removeAll()
        list.removeAll(list2);
        System.out.println(list);

        // size()
        System.out.println(list.size());
        System.out.println(list2.size());

        list2.clear();
        System.out.println(list2);
        System.out.println(list2.size());
       System.out.println(list2);

        //iterator() - returns an iterator to access eleements of the collection.
        //it is a standard way , with the help of iterator we can traverse to all the dtata stuc / coellection.
        //Method : hasNext(): - 
                //  if any element will present in our list so it can return ->  true ->  and moved to the next element.
        // next():-
        //   to return or acces specific  element we can use a next() method.

        //@ we want to traverse list using iterator.
      Iterator <Integer> iterator = list.iterator();
    
      while (iterator.hasNext()) {
         System.out.println("element : " + iterator.next());
      }

    }
}
