package Day08;

import java.util.Random;

public class Student {
    int number;
    int state;
    int score;
    public String xinxi(){
        return "学号:  "+number+"\t班级:  "+state+"\t分数  "+score;

    }

    public static void main(String[] args) {
        Student[] stus = new Student[20];
        //遍历数组。给每个对象赋值
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student();
            stus[i].number = i + 1;
            stus[i].state = (int) (Math.random() * 6 + 1);
            stus[i].score = (int) (Math.random() * (100 + 1));

        }
////按照分数排序（冒泡排序）
//        for (int i = 0; i < stus.length - 1; i++) {
//            for (int j = 0; j < stus.length - 1 - i; j++) {
//                if (stus[j].score > stus[j + 1].score) {
//                    Student temp = stus[j];
//                    stus[j] = stus[j + 1];
//                    stus[j + 1] = temp;
//                }
//            }
//        }
        //按照班级排序
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].state>stus[j+1].state){
                    Student temp=stus[j];
                    stus[j]=stus[j+1];
                    stus[j+1]=temp;

                }
            }
        }

            for (int n = 0; n < stus.length; n++) {
                System.out.println(stus[n].xinxi());
                // System.out.println("学号:"+stus[n].number+"\t班级:"+stus[n].state+"\t分数:"+stus[n].score+"\t");
                // System.out.println("=============");
                if (stus[n].state == 3) {
                 //   System.out.println(stus[n].xinxi());
                   // System.out.println("学号:" + stus[n].number + "\t班级:" + stus[n].state + "\t分数:" + stus[n].score + "\t");
                }
            }



    }
}
