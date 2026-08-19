
interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("paid  " + amount + "usig credit card ");

    }

}

class Googlepay implements Payment {

    public void pay(double amount) {
        System.out.println("paid  " + amount + "using gpay");

    }
}

public class PaymentSystem {
    public static void main(String[] args) {

        Payment pm ;
    
        pm = new CreditCard();
        pm.pay(12365);

        pm = new Googlepay();
        pm.pay(963258);

    }
}
