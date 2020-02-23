package cn.number1;

/**
 * @author zy
 * @create 2019-11-18 17:25
 */
public class CheckingAccount extends Account {
    SavingAccount protectedBy;

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, SavingAccount protectedBy) {
        super(balance);
        this.protectedBy = protectedBy;
    }

    public boolean Withdraw(double number) {
        if (balance - number > 0) {
            balance -= number;
            return true;
        } else if (protectedBy != null && protectedBy.getBalance() + balance - number > 0) {
            protectedBy.Withdraw(number - balance);
            balance = 0;
            return true;
        } else {
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
