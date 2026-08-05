class Animal{

  void sound(){
    System.out.println("animal makes sound..");
  }
     
}
class dog extends Animal{
    void sound(){
        System.out.println("dog is barking..");
    }
}
class cat extends Animal{
    void sound(){
        System.out.println("cat meu meuu..");
    }
}

public class Method {
    public static void main(String[] args) {
    // dog d= new dog();
    // d.sound();
Animal a = new dog();
a.sound();;

a=new cat();
a.sound();


    }
}
