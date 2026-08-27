
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

        System.out.println(names.contains("Bhaiyya"));

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

        num.sort(null);
        System.out.println(num);
    }

}
