package Test2;

public class Test2 {
    public static void main(String[] args) {
        boolean isFast = true;
        String miaoShu = "收支" + " \t" + "账户金额" + "\t\t" + "收支金额" + "\t\t" + "说 明" + "\n";
        int shje = 10000;
        while (isFast) {

            System.out.println("---家庭收支记账软件-----");
            System.out.println();
            System.out.println("    1 收支明细");
            System.out.println("    2 登记收入 ");
            System.out.println("    3 登记支出");
            System.out.println("    4 退 出");
            System.out.println();
            System.out.println("请选择(1-4)：");
            char c = Utility.readMenuSelection();
            switch (c) {
                case '1':
                    System.out.println("1");
                    System.out.println("-----当前收支明细记录--");
                    System.out.println(miaoShu);

                    break;
                case '2':
                   // System.out.println("2");
                    System.out.println("本次收入金额：");
                    int inMony = Utility.readNumber();
                    shje+=inMony;
                    System.out.println("本次收入说明：");
                    String str = Utility.readString();
                    miaoShu += ("收入\t" +"\t"+shje+"\t\t"+inMony+"\t\t"+str+"\n");
                    break;
                case '3':
                    System.out.println("3");
                    System.out.println("本次支出金额：");
                    int outMony = Utility.readNumber();
                    shje-=outMony;
                    System.out.println("本次支出说明：");
                    String outStr = Utility.readString();
                    miaoShu += ("支出\t" +"\t"+shje+"\t\t"+outMony+"\t\t"+outStr+"\n");

                    break;
                case '4':
                    System.out.println("4");
                    System.out.println("确认是否退出(Y/N)：");
                    char result = Utility.readConfirmSelection();
                    if(result=='Y'){
                       isFast=false;
                    }
                    break;


            }
        }
    }
}
