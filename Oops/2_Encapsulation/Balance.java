public class Balance{

    private int balance;

  public void setBalance(int balance){

    if(balance > 0){

    
     this.balance=balance;
    }
    else{
        System.out.println("balnce is invalid..");
    }
 
  }
  public int getBalance(){
    
    return balance;
  }


    public static void main(String[] args) {
    Balance bal = new Balance();
    bal.setBalance(500000);
        System.out.println(bal.getBalance());

    }
}