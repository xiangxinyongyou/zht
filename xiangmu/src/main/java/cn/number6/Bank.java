package cn.number6;

/**
 * �������ж���
 *
 * @author Think Pad
 */
public class Bank {

    private Customer[] customers;

    private int numberOfCustomer;
    private static Bank ins=new Bank();

//	private static Bank instance = new Bank();

    public Bank() {
        customers = new Customer[5];
    }

    public static Bank getBank() {
        return ins;
    }

    /**
     * ���ݴ���Ĳ�������һ���µ� Cusotmer ����, ���Ѹö��󸳸� customers ��ָ����Ԫ��
     *
     * @param firstName
     * @param lastName
     */
    public void addCustomer(String firstName, String lastName) {
        //1.���ݴ���Ĳ�������һ���µ� Cusotmer ����
        Customer cust = new Customer(firstName, lastName);

        //2.�� 1 �´����� Customer ���󸳸� customers ��ָ����Ԫ��
        customers[numberOfCustomer] = cust;

        //3. ʹ��ʾ customers �������ж��ٸ������� Customer ��������� + 1
        numberOfCustomer++;
    }

    /**
     * ���� ��ʾ customers �������ж��ٸ������� Customer ���������
     *
     * @return
     */
    public int getNumOfCustomers() {
        return numberOfCustomer;
    }

    /**
     * ����ָ��������Ӧ�� Customer ����
     *
     * @param index
     * @return
     */
    public Customer getCustomer(int index) {
        return customers[index];
    }
}
