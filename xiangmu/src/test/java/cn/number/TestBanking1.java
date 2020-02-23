package cn.number;


/**
 * @author zy
 * @create 2019-11-18 14:31
 */
public class TestBanking1 {
    public static void main(String[] args) {

//        Customer customer = new Customer("Jane", "Smith");
        Customer customer =null;
        customer = new Customer("Jane", "Smith");
        System.out.println(customer.getFirstName() + " " + customer.getLastName());
//        Account account = new Account(500);
        Account account =null;
        account=new Account(500);

        System.out.println("Creating an account with a " + account.getBalance() + " balance");
        customer.setAccount(account);
        boolean withdraw = customer.getAccount().Withdraw(150);
        System.out.println("Withdraw 150.00:"+withdraw);
        System.out.println("++=======");
        System.out.println(account.getBalance());
        boolean deposit = customer.getAccount().deposit(22.5);
        System.out.println("Deposit 22.50: "+deposit);
        boolean withdraw1 = customer.getAccount().Withdraw(47.62);
        System.out.println("Withdraw 47.62:"+withdraw1);
        boolean withdraw2 = customer.getAccount().Withdraw(400);
        System.out.println("Withdraw 400.00:"+withdraw2);
        double balance = customer.getAccount().getBalance();
        System.out.println("Customer ["+customer.getFirstName()+" ,"+customer.getLastName()+" ] has a balance of  "+balance);




       /* double deposit = customer.getAccount().Withdraw(150);
        customer.getAccount().deposit(22.5);
        customer.getAccount().Withdraw(47.62);
        double balance = customer.getAccount().getBalance();
        System.out.println("Customer ["+customer.getFirstName()+" ,"+customer.getLastName()+" ] has a balance of  "+balance);
*/
      /*  double withdraw = account.Withdraw(150);
        System.out.println(withdraw);
        double deposit = account.deposit(22.5);
        System.out.println(deposit);
        double withdraw1 = account.Withdraw(47.62);
        System.out.println(withdraw1);
        System.out.println(account.getBalance());*/

        System.out.println("=================================");
        Bank bank = new Bank();
        bank.addCustomer("Simms","Jane");


        bank.addCustomer("Bryant","Owen");

        bank.addCustomer("Soley","Tim");

        bank.addCustomer("Soley","Maria");




        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            System.out.println(bank.getCustomer(i).getFirstName()+" ,"+bank.getCustomer(i).getLastName());
        }

    }

}
