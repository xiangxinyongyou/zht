package Lianxi10;


import java.util.Scanner;
import java.util.Vector;

public class ScorTest {


    public static void main(String[] args) {
        int max = 0;
        char leave;
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        while (true) {
            int number = sc.nextInt();
            if (number < 0) {
                break;
            }

            v.addElement(number);
            //求最大值
            if (number > max) {
                max = number;
            }
        }
        //遍历
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);

            //jdk5.0之前
//            Integer number1= (Integer) obj;
//            int number = number1.intValue();
//           5.0之后
            int number1 = (Integer) obj;
            //int number=(Integer) obj;
            if (max - number1 < 10) {
                leave = 'A';
            } else if (max - number1 < 20) {
                leave = 'b';
            } else if (max - number1 < 30) {
                leave = 'c';

            } else {
                leave = 'd';
            }
            System.out.println("编号" + i + "分数：" + number1 + "等级" + leave);
        }


    }


}
