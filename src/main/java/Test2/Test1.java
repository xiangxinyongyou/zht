package Test2;

import Day11.CMUtility;

public class Test1 {
    public static void main(String[] args) {
        boolean ispare = true;
        int zhje = 10000;
        String details = "收支\t账户金额 \t收支金额 \t说 明\n";

        // Scanner sc = new Scanner(System.in);
        while (ispare) {
            System.out.println("-----------------家庭收支记账软件-----------------");
            System.out.println();
            System.out.println("                 1 收支明细");
            System.out.println("                 2 登记收入");
            System.out.println("                 3 登记支出");
            System.out.println("                 4 退 出");
            System.out.print("                 请选择(1-4):");
            char c = Utility.readMenuSelection();

            switch (c) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("--------------------------------");
                    break;
                case '2':
                    System.out.println("  本次收入金额");
                    int money = Utility.readNumber();
                    System.out.println("本次收入的说明");
                    String str = Utility.readString();
                    zhje += money;
                    details += ("收支\t" + zhje + "\t\t\t" + money + "\t\t" + str + "\n");

                    System.out.println("-----登记已完成-----");
                    break;
                case '3':
                    System.out.println("本次支出的金额：");
                    int outmoney = Utility.readNumber();
                    System.out.println("支出的说明");
                    String outstr = Utility.readString();
                    if (zhje>outmoney){
                        zhje -= outmoney;
                        details += ("支出\t" + zhje + "\t\t\t" + outmoney + "\t\t" + outstr + "\n");
                    }else {
                        System.out.println("资金不够");
                    }
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N)：");
                    char c1 = Utility.readConfirmSelection();
                    if (c1 == 'Y') {
                        ispare = false;
                    }
                    break;
            }
        }
    }
}
