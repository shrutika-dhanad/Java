class Employee{

    Employee(){
        System.out.println("employee is ready to work..");
    }
}
class Staff extends Employee{

    Staff(String name , int age ){
     System.out.println("employeee name is : " + name + " and his age is :"+ age );
    }
}

public class Emp {
    public static void main(String[] args) {
        Staff st = new Staff("Pritesh", 25);

    }
}
