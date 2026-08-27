import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("shrutika");
        names.add("Bhagwan");
        names.add("Dhanad");
        names.add("Pritesh");
        names.add("Sunita");

        System.out.println("list of names:" + names);

        names.add(1, "vaibhavi");
        names.add(4, "Bhaiyya");
        System.out.println(names);

        names.addFirst("Toyota");
        names.addLast("TATA");

        System.out.println(names);

        names.remove(0);
        System.out.println(names);

        System.out.println("before remove first" + names);
        names.removeFirst();
        System.out.println("after removefirst " + names);

        names.removeLast();
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

        LinkedList<String> newList = new LinkedList<>();
        newList.add("ok");
        newList.add("hii");
        newList.add("ok");
        newList.add("hello");
        newList.add("ok");
        newList.add("Thik");
        newList.add("chalan");
        System.out.println("origina l:  " + newList);

        System.out.println(newList.lastIndexOf("ok"));

        System.out.println(newList.getFirst());
        System.out.println(newList.getLast());

        // peek - returns the 1st element(head) of the linked list.

        System.out.println(newList.peek());

        LinkedList<Integer> num = new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println(num);

        System.out.println(num.poll()); // poll can return and remove the 1st element from the linkedlist.

        System.out.println(num);

        // offer : add the specified eleemnt at the end of the linked list.

        num.offer(500);
        System.out.println(num);

    }

}