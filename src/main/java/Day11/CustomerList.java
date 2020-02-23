package Day11;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;
//构造器初始化对象
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }
//添加对象
    public boolean addCustomer(Customer customer) {
        //如果对象的个数大于数组的长度，不能存储
        if (total >= customers.length) return false;
        //否则可以存储新的对象到最后位置上，并且总个数加加
        customers[total++] = customer;
        return true;
    }
//根据索引修改对象
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) return false;

        customers[index] = cust;
        return true;
    }
//根据索引删除
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) return false;

        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }

        customers[--total] = null;

        return true;
    }
//获取素有的对象
    public Customer[] getAllCustomers() {
        //创建一个新的对象，遍历后，将原来的数据赋值到新的对象中去，并且返回
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }
//获取对象的总个数
    public int getTotal() {
        return total;
    }
//获取索引下的对象信息
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) return null;

        return customers[index];
    }
}
