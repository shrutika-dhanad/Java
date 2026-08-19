interface Payments{
    void pay();

}

class GooglePlay implements Payments{
    public void  pay(){
    System.out.println("payment using gpay..");
    }
}

class Phonepay implements Payments{
    public void pay(){
        System.out.println("payment using Phonepay..");
    }
}



public class InterfacePoly {
    public static void main(String[] args) {

        Payments[] paym = {
               
            new GooglePlay(),
            new Phonepay()
        };

      for( Payments p : paym){
        p.pay();
      }



    }
    
}
