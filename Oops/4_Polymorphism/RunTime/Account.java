
class BankAccount{
    void interrestRate(){
        System.out.println("General interest rate ..");
    }
}

class SavingAcoount extends BankAccount{
    void interrestRate(){
        System.out.println("isaving ac interest rate 10%");
    }
}

class CurrentAccount extends  BankAccount{
    void interrestRate(){
        System.out.println("cuurent ac interest rate 7%");
    }
}
public class Account {
public static void main(String[] args) {

    // BankAccount ba= new BankAccount();
    // ba.interrestRate(); ;

    // ba =  new SavingAcoount();
    // ba.interrestRate();

    // ba= new CurrentAccount();
    // ba.interrestRate();

BankAccount[] ba ={
    new BankAccount(),
    new CurrentAccount(),
    new SavingAcoount()
};

for(BankAccount b : ba ){
    b.interrestRate();
}

}    
}
