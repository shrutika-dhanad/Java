
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

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

        Vector<String> newList = new Vector<>();
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


        Vector<Integer> num = new Vector<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println(num);

     

    }

} 
    

