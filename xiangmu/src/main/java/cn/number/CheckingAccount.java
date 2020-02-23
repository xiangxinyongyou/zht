package cn.number;

/**
 * @author zy
 * @create 2019-11-18 17:25
 */
public class CheckingAccount extends Account {
   private double overdraftProtection;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    public boolean Withdraw(double number) {
        if (balance - number > 0) {
            balance-=number;
            return true;
        }else if (overdraftProtection+balance-number>0){
            overdraftProtection-=(number-balance);
            balance=0;
            return true;
        }else {
            return false;
        }

   /*    if (balance-number>=0){
           balance-=number;
       }else {
           if (overdraftProtection>=number-balance){
               overdraftProtection-=number-balance;
               balance=0;
           }else {
               return false;
           }
       }
       return true;*/
    }
}
