 class  Car {
void start(){
    System.out.println("car is Started..");
}
}

class bike extends Car{
      void honk(){
        System.out.println("bike is horned..");
      } 
}


public class Main {
    public static void main(String[] args) {
        bike bk= new bike();
        bk.start();
        bk.honk();
        

    }
}
