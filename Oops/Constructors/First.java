
class Student{

    String name ;
     int id;
     int age;
     float salary;

     public void printData(){
        System.out.println("name " + this.name);
        System.out.println("id : "+ this.id);
        System.out.println("age " + this.age);
        System.out.println("salary " + this.salary);

     }

     Student(String name , int id, int age, float salary){
      this.name= name;
      this.id=id;
      this.age=age;
      this.salary=salary;

    
     }

}
public class First {
    public static void main(String[] args) {
      
        Student stu = new Student("Shrutika",1,21 , 35000);
           stu.printData();
    }
}
