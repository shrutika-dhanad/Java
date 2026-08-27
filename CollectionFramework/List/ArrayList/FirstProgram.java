import java.util.*;

public class FirstProgram {
    public static void main(String[] args) {
        // Methods:
        // size() , sort , clone , contains, ensureCapacity, isEmpty, indexOf

        // 1.size() - returns the length of the ArrayList.
   

    
        //2.sort() - sort the ArrayList elements.

       
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Before sorting: " + numbers);

        numbers.sort(null); /// null → tells Java to use the natural ordering

        System.out.println("After sorting: " + numbers);


        //clone: creates a new ArrayList with the same element, size and capacity,.
        


        ArrayList<Integer> newList =(ArrayList<Integer>)numbers.clone();
        System.out.println("newList: "+ newList);

        //ensureCapacity() - specifies the total element the arraylis can contain

        // aapn starting lach arraylist cha size min-capacity wr set kryacha asel so we can use ensureCapacity()

        ArrayList<Integer> marks = new ArrayList<>();
         marks.ensureCapacity(100);


        //isEmpty : = checks if the arrayList is empty.

        System.out.println(newList.isEmpty());
        System.out.println(marks.isEmpty());

       //indexOf() : searches a specified element in an arraylist and returns the index of the element.


       System.out.println(newList.indexOf(10));
    }
}
