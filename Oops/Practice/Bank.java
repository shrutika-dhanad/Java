class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;

        }
    }

    public double getBalance() {
        return balance;
    }

}

class savingAccount extends BankAccount {
    public void showAccountType() {
        System.out.println("its a saving account..");
    }
}

public class Bank {
    public static void main(String[] args) {
        savingAccount saveAc = new savingAccount();
        saveAc.deposit(47869);

        System.out.println(saveAc.getBalance());
        saveAc.showAccountType();

    }
}
