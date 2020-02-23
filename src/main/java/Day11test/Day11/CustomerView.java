package Day11test.Day11;
//


public class CustomerView {
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

    private CustomerList customers = new CustomerList(10);

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

    public void enterMainMenu(){
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
        String name = CMUtility.readString(5);
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("性别：");
        String sex = CMUtility.readString(5);
        System.out.print("电话：");
        String phone = CMUtility.readString(5);
        System.out.print("邮箱：");
        String email = CMUtility.readString(15);


    }

    private void modifyCustomer() {

    }

    private void deleteCustomer() {

    }

    private void listAllCustomers() {

        System.out.println("---------------------------客户列表---------------------------");
        Customer[] custs = customers.getAllCustomers();
        if (custs.length==0){
            System.out.println("没有客户");
        }else {
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            Customer[] allCustomers = customers.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
            System.out.println(i + 1 + "\t" + custs[i].getName() + "\t" + custs[i].getGender() + "\t" + custs[i].getAge() + "\t\t" + custs[i].getPhone() + "\t" + custs[i].getEmail());
//                System.out.println((i+1) + "\t" + custs[i].getDetails());
            }
        }

        System.out.println("-------------------------客户列表完成-------------------------");
    }




}
