package Day11test.Day11;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class CustomerList{
    private Customer[] customers;//用来保存客户对象的数组
    private int total = 0;//         ：记录已保存客户对象的数量

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static void main(String[] args) {
        CustomerList list = new CustomerList(5);
        System.out.println("对象中的customers"+list.getCustomers());



    }
    public CustomerList(int totalCustomer) {
   Customer[] customers= new Customer[totalCustomer];//这是重新new的数组
//        customers = new Customer[totalCustomer];
        System.out.println("new 的数组"+customers);
        System.out.println("调 用的"+customers);
    }

    public boolean addCustomer(Customer cust) {
        if (total >= customers.length) return false;

        customers[total++] = cust;
        return true;
    }

    public boolean replaceCustomer(int index, Customer cust) {
//        if (index < 0 || index >= total) {
//            return false;
//        }
//        customers[index] = cust;
//        return true;
        if (index >= 0 && index < total) {
            customers[index] = cust;
            return true;
        }
        return false;
    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }

        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[total - 1] = null;
        total--;
        return true;
    }

    public Customer[] getAllCustomers() {
        Customer[] arr = new Customer[total];
        for (int i = 0; i <total; i++) {
            arr[i] = customers[i];
        }
        return arr;
    }

    public Customer getCustomer(int index) {

        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];

    }

    public int getTotal() {
        return total;
    }


}
