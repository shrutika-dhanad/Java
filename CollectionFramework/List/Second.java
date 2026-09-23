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

        //3.toArray() =it can convert any type of collection/list into an aaray.
        //   this method can return object ka Array.

     

       Object[] arr =list.toArray();
       for(Object obj : list)
        {
            System.out.println(obj);
        }


//4.contains: it returns true if eleement is present 
         
     System.out.println(list.contains(82465876));
         



    }
}