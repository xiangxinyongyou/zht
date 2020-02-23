package Lixi2;

public class BankTest {
    public static void main(String[] args) {
        Blank blank = new Blank();
     blank.addCustomer("dd", "liu");
     blank.getCustomer(0).setAccount(new Account(3000));
        double balance = blank.getCustomer(0).getAccount().getBalance();
        System.out.println(balance);
        blank.getCustomer(0).getAccount().withdraw(400);
        double balance1 = blank.getCustomer(0).getAccount().getBalance();
        System.out.println(balance1);
    }
}
