class Copyctor{
String std;
int age;

public void show(){
    System.out.println("std: " + this.std);
    System.out.println("age: " + this.age);
}
Copyctor(Copyctor c2){
this.std= c2.std;
this.age= c2.age;
}

Copyctor(){

}
}



public class Copy {
public static void main(String[] args) {
    Copyctor c1 = new Copyctor();
    c1.std="FYBCA";
    c1.age=19;
   c1.show();


   Copyctor c2= new Copyctor(c1);
   c2.show();

}    
}
