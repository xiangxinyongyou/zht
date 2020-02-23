package cn.number;

/**
 * @author zy
 * @create 2019-11-18 20:47
 */
public class TestBanking {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer;
        Account account;
        //Creating the customer Jane Smith.
        System.out.println("Creating the customer Jane Smith.");

        bank.addCustomer("Jane", "Smith");
        System.out.println("Creating her Savings Account with a 500.00 balance and 3% interest.");
        //Creating her Savings Account with a 500.00 balance and 3% interest.
        bank.getCustomer(0).setAccount(new SavingAccount(500, 0.03));

        //尚硅谷 Java 基础实战—Bank 项目
        //Creating the customer Owen Bryant.
        bank.addCustomer("Owen", "Bryant");
        //Creating his Checking Account with a 500.00 balance and no
        //overdraft protection.
        customer = bank.getCustomer(1);
        customer.setAccount(new CheckingAccount(500));


        //Creating the customer Tim Soley.
        bank.addCustomer("Tim", "Soley");
        customer = bank.getCustomer(2);
        //Creating his Checking Account with a 500.00 balance and 500.00 in
        //overdraft protection.
        customer.setAccount(new CheckingAccount(500, 500));
        //Creating the customer Maria Soley.
        bank.addCustomer("Maria", "Soley");
        customer = bank.getCustomer(3);
        //2和3共用一个账户
        customer.setAccount(bank.getCustomer(2).getAccount());
        //Maria shares her Checking Account with her husband Tim.
        //Retrieving the customer Jane Smith with her savings account.
        System.out.println("Retrieving the customer Jane Smith with her savings account.");
        customer = bank.getCustomer(0);
         account = customer.getAccount();
        //Withdraw 150.00: true
        System.out.println(account.Withdraw(150));

        //Deposit 22.50: true
        System.out.println(account.deposit(22.5));
        //Withdraw 47.62: true
        System.out.println(account.Withdraw(47.62));
        //Withdraw 400.00: false
        System.out.println(account.Withdraw(400));
        //Customer [Simms, Jane] has a balance of 324.88
        System.out.println(account.getBalance()+"======1");
        //Retrieving the customer Owen Bryant with his checking account with
        //no overdraft protection.
         customer = bank.getCustomer(1);
         account=customer.getAccount();
        //Withdraw 150.00: true
        System.out.println(account.Withdraw(150));
        //Deposit 22.50: true
        System.out.println(account.deposit(22.5));
        //Withdraw 47.62: true
        System.out.println("Withdraw 47.62: " + account.Withdraw(47.62));
        //Withdraw 400.00: false
        System.out.println("Withdraw 400.00: " + account.Withdraw(400.00));
        //Customer [Bryant, Owen] has a balance of 324.88
        System.out.println(account.getBalance()+"======2");
        //Retrieving the customer Tim Soley with his checking account that
        //has overdraft protection.
       customer= bank.getCustomer(2);
       account=customer.getAccount();

        //Withdraw 150.00: true
        System.out.println(account.Withdraw(150));
        //Deposit 22.50: true
        System.out.println(account.deposit(22.5));
        //Withdraw 47.62: true
        System.out.println(account.Withdraw(47.62));
        //Withdraw 400.00: true
        System.out.println(account.getBalance());
        boolean withdraw = account.Withdraw(400);
        System.out.println(withdraw);
        //Customer [Soley, Tim] has a balance of 0.0
        System.out.println(account.getBalance()+"=====3------>    0");
        //Retrieving the customer Maria Soley with her joint checking account
        //with husband Tim.
      customer=  bank.getCustomer(3);
      account=customer.getAccount();
        //Deposit 150.00: true  //账户原来是0元  存入150元
        System.out.println(account.getBalance());
        System.out.println(account.deposit(150));
        System.out.println(account.getBalance());
        //Withdraw 750.00: false   取出750 元  没有成功  返回false
        System.out.println(account.Withdraw(750));

        //Customer [Soley, Maria] has a balance of 150.0
        System.out.println(account.getBalance());
    }
}
