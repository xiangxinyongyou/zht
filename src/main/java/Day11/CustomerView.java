package Day11;
//


import java.text.BreakIterator;

public class CustomerView {
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

    private CustomerList customers = new CustomerList(6);

    //    public CustomerView() {
//        Customer customer = new Customer("zhangsan", '男', 22, "1381231221223", "34324");
//        customers.addCustomer(customer);
//        //    public CustomerView() {
////        Customer ctu=new Customer("lsdfj", '男', 33, "1233434", "3324324");
////        customers.addCustomer(ctu);
////
//    }
    public CustomerView() {
        Customer cust = new Customer("张三", '男', 30, "010-56253825",
                "abc@email.com");
        boolean b = customers.addCustomer(cust);
    }

    boolean isflage = true;

    public void enterMainMenu() {
        while (isflage) {

            System.out
                    .println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");
            char c = CMUtility.readMenuSelection();
            switch (c) {
                case '1':
                    //添加
                    System.out.println("1");
                    addNewCustomer();
                    break;
                case '2':
                    //修改
                    System.out.println("2");
                    modifyCustomer();
                    break;
                case '3':
                    //删除
                    System.out.println("3");
                    deleteCustomer();

                    break;
                case '4':
                    //查找
                    System.out.println("4");
                    listAllCustomers();

                    break;
                case '5':
                    //退出
                    System.out.println("5");
                    System.out.println("确认是否退出(Y/N)：");
                    char c1 = CMUtility.readConfirmSelection();
                    if (c1 == 'Y') {
                        isflage = false;
                        break;
                    }

            }
        }


//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
    }

    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(2);
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("电话：");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱：");
        String email = CMUtility.readString(30);
        Customer customer = new Customer(name, gender, age, phone, email);
        boolean b = customers.addCustomer(customer);
        if (b == true) {
            System.out.println("添加用户成功");
        } else {
            System.out.println("用户目录已满");
        }
    }

    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        int number = 0;
        boolean isflage = true;
        while (isflage) {

            System.out.print("请选择待修改客户编号(-1退出)：");
            number = CMUtility.readInt();
            if (number == -1) {
                isflage = false;
            }
            int total = customers.getTotal();
            if (number > total || number == 0) {
                System.out.println("无法找到用户");
            } else {
                //也可以把修改的业务逻辑写到这里
                break;
            }
        }
        //修改客户信息
        Customer customer = customers.getCustomer(number - 1);
        System.out.println("姓名（" + customer.getName() + ")");
        String reName = CMUtility.readString(12, customer.getName());
        System.out.println("性别（" + customer.getGender() + ")");
        char c = CMUtility.readChar(customer.getGender());
        System.out.print("年龄(" + customer.getAge() + ")：");
        int age = CMUtility.readInt(customer.getAge());

        System.out.print("电话(" + customer.getPhone() + ")：");
        String phone = CMUtility.readString(15, customer.getPhone());

        System.out.print("邮箱(" + customer.getEmail() + ")：");
        String email = CMUtility.readString(15, customer.getEmail());
        Customer recustomer = new Customer(reName, c, age, phone, email);
        boolean b = customers.replaceCustomer(number - 1, recustomer);
        if (b == true) {
            System.out.println("修改成功");
        } else {
            System.out.println("失败");
        }
    }

    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        boolean isflage = true;
        int number = 0;
        while (isflage) {

            System.out.print("请选择待删除客户编号(-1退出)：");
            number = CMUtility.readInt();
            if (number == -1) {
                isflage = false;
                return;
            }

            int total = customers.getTotal();
            if (number > total || number == 0) {
                System.out.println("无法找到用户");
            } else {
                break;
            }
        }
        //删除用户
        System.out.print("确认是否删除(Y/N)：");
        char c = CMUtility.readConfirmSelection();
        if (c == 'N') {
            return;
        }
        boolean b = customers.deleteCustomer(number - 1);
        if (b==true){
            System.out.println("成功");
        }else {
            System.out.println("删除失败");
        }

    }

    private void listAllCustomers() {

        System.out.println("---------------------------客户列表---------------------------");
        Customer[] custs = customers.getAllCustomers();
        if (custs.length == 0) {
            System.out.println("没有客户");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            Customer[] allCustomers = customers.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
//                System.out.println(i + 1 + "\t" + custs[i].getName() + "\t" + custs[i].getGender() + "\t" + custs[i].getAge() + "\t\t" + custs[i].getPhone() + "\t" + custs[i].getEmail());
//                System.out.println((i+1) + "\t" + custs[i].getDetails());
                System.out.println(i + 1 + "\t\t" + custs[i].info());
            }
        }

        System.out.println("-------------------------客户列表完成-------------------------");
    }


}
