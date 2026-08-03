
class Vehicle{
  public  void start(){
        System.out.println(" Vehicle started....");
    }
}
 class Yumhaa extends Vehicle{
    public void start(){

        super.start();
        System.out.println("yumhaa startedd....");
     }    
 }

public class Car {    
    public static void main(String[] args) {
        
        Yumhaa yumhaa= new Yumhaa();
        yumhaa.start();


    }
}
