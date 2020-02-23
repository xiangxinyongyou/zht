package Day10;

public class AccountAndCusomeTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        Account account = new Account(1000,2000,0.0123 );
        customer.setAccount(account);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
//       account.deposit(100);
//       account.withdraw(960);
//       account.withdraw(2000);
       //Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is
        //1140.0
        System.out.println("Customer ["+customer.getFirstName()+","
                +customer.getLastName()+"]  has a account: id is "+account.getId()+"   annualInterestRate is "+account.getAnnualInterestRate()*100+"%"+account.getBalance());

    }
}
