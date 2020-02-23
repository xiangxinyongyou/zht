package Lixi2;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Blank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Blank() {
        customers=new Customer[10];
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
        //将指定客户信息放到数组中
        customers[numberOfCustomer] = customer;
        numberOfCustomer++;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void setNumberOfCustomer(int numberOfCustomer) {
        this.numberOfCustomer = numberOfCustomer;
    }
    public Customer getCustomer(int indext){
        if (indext>=0&&indext<numberOfCustomer){

            return customers[indext];
        }
        return null;
    }
}
