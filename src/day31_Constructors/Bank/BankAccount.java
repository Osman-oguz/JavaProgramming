package day31_Constructors.Bank;

public class BankAccount {
    public String accountHolder;
    public long accountNUmber;
    public double balance;

    public void setInfo(String accountHolder, long accountNUmber) {
        this.accountHolder = accountHolder;
        this.accountNUmber = accountNUmber;

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNUmber=" + accountNUmber +
                ", balance= $" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is: " + balance);
    }

    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount> balance){
            System.out.println("Insufficient balance");
            return;
        }
        if (amount <= 0){
            System.out.println("Withdrawing amount can not be negative or zero");
            return;
        }
        balance -= amount;
    }




}
