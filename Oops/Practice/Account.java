

public class Account{

    private double balance;
    public void setBalance(double balance){
        if(balance>= 0){
        this.balance=balance;
        }else{
            System.out.println("balance cannot be negative");
        }

    }

    public double getBalance(){
        return balance;

    }

    public static void main(String[] args) {
        
    Account bal = new Account();

    bal.setBalance(500000);

    System.out.println(bal.getBalance());
    }
}