class Vehicle{
void start()
{
System.out.println("vehicle is started..");
}
}
class Motorcycle extends Vehicle{
    void start(){
        System.out.println("Motorcycle is started..");
    }
}
class Luna extends Motorcycle {
    void start(){
        System.out.println("Luna is stated..");
    }
}

public class Collectionvehicle {
    public static void main(String[] args) {
        
        Vehicle vh;
        vh= new Luna();
        vh.start();
    }
    
}
