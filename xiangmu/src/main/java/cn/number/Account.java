package cn.number;

/**
 * @author zy
 * @create 2019-11-18 14:22
 */
public class Account {
    protected double balance;//余额

    public Account(double balance) {
        this.balance = balance;
    }
    //查询钱

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存钱
  /*  public double deposit(double number) {
        balance += number;
        return number;
    }*/

    public boolean deposit(double number) {
        balance += number;
        return true;
    }

    //取钱
   /* public double Withdraw(double number) {
        balance -= number;
        return number;
    }*/
    public boolean Withdraw(double number) {
        if (number > balance) {
            return false;
        }
        balance -= number;
        return true;
    }

}
