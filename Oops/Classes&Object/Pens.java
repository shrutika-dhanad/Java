class Typesofpen{
    String color ;
    String type;
    public void write(){
        System.out.println("write something");
    } 

    public void printColor(){
        System.out.println(this.color);

    }
    public void printType(){
        System.out.println(this.type);
    }

}
class student {
String name ;
int age ;
 
public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
}

public class Pens {
    public static void main(String[] args) {
    Typesofpen tp = new Typesofpen();
    tp.color="yellow";
    tp.type="gel";
    tp.write();
    tp.printColor();
    tp.printType();



student stud = new student();
stud.name="shrutika";
stud.age=21;
stud.printInfo();



    }
}
