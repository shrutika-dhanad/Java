import java.util.ArrayList;
import java.util.List;
public class Second {
    public static void main(String[] args) {

//     add() , 
//    addAll() ,
//    get() ,
//    iterator() ,
//    set() ,
//    remove() ,
//    removeAll() ,
//    clear() ,
//    size() ,
//    toArray() , 
//    contains() 
    
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
 

        //1.get()

        System.out.println(list.get(5));

        //2.set()

        System.out.println("before set :" + list);
        list.set(2 ,500);
        System.out.println(list);

        //toArray() =

       Object [] arr =list.toArray();
       
    }
}
