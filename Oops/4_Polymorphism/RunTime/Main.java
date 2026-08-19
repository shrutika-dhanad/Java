// package RunTime;
class Animal{
    void sound(){
        System.out.println("Animals makes sound..");
    }
}
class Cat extends  Animal{
    void sound(){
        System.out.println("Cat make a miuu sound..");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog barks ");
    }
}

public class Main {
    public static void main(String[] args) {
Animal an = new Cat();
an.sound();
        
    }
}
