class Vehicle {
    Vehicle(){
        System.out.println("vehicle is Started..");
    }
}
class Bike extends Vehicle{ 
    


    Bike(){
        System.out.println("bike is started..");
    }
    
    Bike(String brand){
        super();
        
        System.out.println("bike is again started.."+brand);
    }

    }



public class Travel {
    public static void main(String[] args) {
        Bike b = new Bike("honda");

    }
}
