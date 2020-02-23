package Day11test;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customerl = new Customer("liis", '男', 33, "234323", "5453423");
        customerList.addCustomer(customerl);
    }

    public void enterMainMenu() {
        boolean isflage = true;
        do {
            System.out
                    .println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");
            char number = CMUtility.readChar();


            switch (number) {
                case '1':
                    System.out.println("1");
                    addNewCustomer();
                    break;
                case '2':
                    System.out.println("2");
                    modifyCustomer();
                    break;
                case '3':
                    System.out.println("3");
                    deleteCustomer();
                    break;
                case '4':
                    System.out.println("4");
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("5");
                    System.out.print("确认是否退出(Y/N)：");
                    char c = CMUtility.readConfirmSelection();
                    if (c == 'Y') {
                        //跳出循环
                        isflage = false;
                        break;
                    }
            }
        } while (isflage);
    }

    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.println("姓名");
        String name = CMUtility.readString(11);
        System.out.println("性别");
        char gent = CMUtility.readChar();
        System.out.println("年龄");
        int age = CMUtility.readInt();

        System.out.println("手机号");
        String phone = CMUtility.readString(22);

        System.out.println("邮箱");
        String email = CMUtility.readString(33);
        Customer customer = new Customer(name, gent, age, phone, email);
        //把添加的信息放到CustomerList对象中
        boolean b = customerList.addCustomer(customer);
        //是否添加成功
        if (b == true) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }

    }

    private void modifyCustomer() {
        System.out.println("--------修改客户-------------");
        int i=0;
        Customer cust=null;
        for (; ; ) {
            System.out.println(" 请选择待修改客户编号(-1退出):");
             i = CMUtility.readInt();

            if (i==-1){
                return;

            }
             cust = customerList.getCustomer(i - 1);

            if (cust==null){
                System.out.println("没有用户");

            }else {
                break;
            }

        }
        //修改
        String name = CMUtility.readString(12, cust.getName());

        char c = CMUtility.readChar(cust.getGender());
        int s = CMUtility.readInt(cust.getAge());
        String s1 = CMUtility.readString(22, cust.getPhone());
        String s2 = CMUtility.readString(33, cust.getEmail());
         cust = new Customer(name, c, s, s1, s2);
        boolean b = customerList.replaceCustomer(i - 1, cust);
        if (b) {
            System.out
                    .println("---------------------修改完成---------------------");
        } else {
            System.out.println("----------无法找到指定客户,修改失败--------------");
        }


    }

    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");

        int index = 0;
        Customer cust = null;
        for (;;) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            cust = customerList.getCustomer(index - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户！");
            } else
                break;
        }

        System.out.print("确认是否删除(Y/N)：");
        char yn = CMUtility.readConfirmSelection();
        if (yn == 'N')
            return;

        boolean flag = customerList.deleteCustomer(index - 1);
        if (flag) {
            System.out
                    .println("---------------------删除完成---------------------");
        } else {
            System.out.println("----------无法找到指定客户,删除失败--------------");
        }
    }

    private void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        Customer[] custs = customerList.getAllCustomers();
        if (custs.length == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            for (int i = 0; i < custs.length; i++) {
//            System.out.println(i + 1 + "\t" + custs[i].getName() + "\t" + custs[i].getGender() + "\t" + custs[i].getAge() + "\t\t" + custs[i].getPhone() + "\t" + custs[i].getEmail());
                System.out.println((i+1) + "\t" + custs[i].getDetails());
            }
        }

        System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
