import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

class student{
    public int age;
    public String name;
    public int weight;

    public void setAge(int age){
        this.age=age;
        
    }
    public void setName(String name){
        this.name=name;

    }
    public void setWeight(int weight){
        this.weight=weight;

    }


    public int getAge(){
        return age;

    }
    public String getName(){
        return name;

    }
    public int weight(){
        return weight;

    }
}
public class comparableExam {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(19, "vipul" , 95));

        
    //     List<Integer> list=ne w ArrayList<>();
    //     list.add(15);
    //     list.add(54);
    //     list.add(8);
    //     list.add(25);
    //     list.add(95);
    //     list.add(75);
    //     list.add(19);
    
    //     System.out.println("List of items:"+ list );

    // Collection.sort(list);

    }
    
}
