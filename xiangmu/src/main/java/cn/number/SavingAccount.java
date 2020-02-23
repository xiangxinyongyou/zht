package cn.number;

/**
 * @author zy
 * @create 2019-11-18 17:24
 */
public class SavingAccount extends Account {

    double interestRate;


    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
}
