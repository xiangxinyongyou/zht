package ExentTest;

public class Account {
    private int id;//账号
    private double balance;//余额
    private double annualInterestRate;//利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //返回月利率
    public double getMonthlyInterest() {
        return annualInterestRate / 12;

    }

    //取钱
    public void withdraw(double amount) {
        if (amount>balance){
            System.out.println("余额不足");
            return;
        }
        balance-=amount;
        System.out.println("取款金额为"+amount);
        System.out.println("所剩的余额为"+balance);

    }

    //    存钱
    public void deposit(double amount) {
        if (amount>0){
            System.out.println("存入的金额为"+amount);
            balance+=amount;
            System.out.println("存入后的金额为"+balance);
            System.out.println(annualInterestRate/12);
            return;
        }

    }
}
