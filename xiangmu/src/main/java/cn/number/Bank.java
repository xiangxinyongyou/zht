package cn.number;

/**
 * @author zy
 * @create 2019-11-18 16:33
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    //初始化数组的长度
    public Bank() {
        customers = new Customer[5];
    }

    //把对象放到数组中放回索引的位置
    public int addCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);
        customers[numberOfCustomers] = customer;
        numberOfCustomers++;
        return numberOfCustomers;

    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];

    }

   private  static Bank bank=new Bank();

    public static Bank getBanking() {
        return bank;
    }
}
