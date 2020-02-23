package Lixi2;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("余额不足");
            return;
        }
        balance -= amount;
        System.out.println("取钱"+amount);

    }
    public void deposit(double amount){
        if(amount>0){

            System.out.println("存着钱");
        }
    }
}
