package ExentTest;

public class CheckAccount extends Account {
    private double overdraft;//透支额度

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            //方式一
            //  super.withdraw(amount);
            //
            setBalance(getBalance() - amount);

            System.out.println("剩余额度为："+getBalance());
            System.out.println("可透支额度为："+overdraft);
        } else if (overdraft >= amount - getBalance()) {
            overdraft -= amount - getBalance();
            setBalance(0);//或者写成  super.withdraw(getBalance());
            System.out.println("账户余额为："+getBalance());
            System.out.println("可透支的额度为："+overdraft);
        } else {
            System.out.println("超出透支额度");
        }
    }


}
