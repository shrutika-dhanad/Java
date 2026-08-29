
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> names = new Stack<>();

        names.add("shrutika");
        names.add("Bhagwan");
        names.add("Dhanad");
        names.add("Pritesh");
        names.add("Sunita");

        System.out.println("list of names:" + names);

        names.add(1, "vaibhavi");
        names.add(4, "Bhaiyya");
        System.out.println(names);

        names.remove(0);
        System.out.println(names);

        names.remove(String.valueOf("shrutika"));
        System.out.println(names);

        System.out.println("is bhaiyya word contains in stack ");
        System.out.println(names.contains("Bhaiyya"));
        System.out.println("yes ");

        // names.clear();
        // System.out.println(names);

        System.out.println(names.indexOf("Sunita"));

        System.out.println(names.lastIndexOf("Bhagwan"));

        System.out.println(names.size());
        System.out.println(names.isEmpty());

        // names.clear();
        // System.out.println(names.size());

        Stack<String> newList = new Stack<>();
        newList.add("ok");
        newList.add("hii");
        newList.add("ok");
        newList.add("hello");
        newList.add("ok");
        newList.add("Thik");
        newList.add("chalan");
        System.out.println("origina l:  " + newList);

        System.out.println(newList.lastIndexOf("ok"));
        ;

        Stack<Integer> num = new Stack<>();
        num.add(1);
        num.add(2);
        num.add(0);
        num.add(4);
        num.add(5);

        System.out.println(num);

        Iterator<Integer> iterator = num.iterator();

        while (iterator.hasNext()) {
            System.out.println("elements in the stack is : - " + iterator.next());
        }

        System.out.println("sorting" + num);
        num.sort(null);
        System.out.println("sorting" + num);

        System.out.println(num.peek()); // return the topest elemetn in the stack

        num.push(10025562);
        System.out.println(num);

        num.pop();
        System.out.println(num);  //it can remove the top most means last eleemnt in the stack 


        System.out.println(num.search(50));  //if the element is present in the stack it return 1 and otherwise return -1.
        System.out.println(num.empty());   

         num.removeAll(num);
         System.out.println(num);

         System.out.println(num.empty());
         System.out.println(num.search(0));


         System.out.println(num.toArray());
    }

}
