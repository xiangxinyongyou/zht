package Day08;

import javax.management.monitor.StringMonitorMBean;

import static java.lang.Math.*;

public class Student1 {
    int number;
    int state;
    int score;

    public String info() {
        return "编号" + number + "==>" + state + "===>" + score;
    }


    public static void main(String[] args) {
        Student1[] st = new Student1[20];
        for (int i = 0; i < st.length; i++) {
            st[i] = new Student1();
            st[i].number = i + 1;
            st[i].state = (int) (Math.random() * 6 + 1);
            st[i].score = (int) ((Math.random() * 100) + 1);


        }
        Student1 str = new Student1();
        str.print(st);
        System.out.println("==========");
        str.state(st,6);
        System.out.println("----------------");
       str.sorte(st);


    }
    //遍历学生的方法
    public void print(Student1[] st){
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].info());
            System.out.println();

        }
    }
    public void state(Student1 [] st,int state){
        for (int i = 0; i < st.length; i++) {
            if (st[i].state==state){
                System.out.println(st[i].info());
            }
        }
    }

    public void sorte(Student1 [] st) {
        //冒泡排序
        for (int i = 0; i < st.length - 1; i++) {
            for (int j = 0; j < st.length-1-i; j++) {
                if (st[j].score>st[j+1].score){
                    Student1 temp=st[j];
                    st[j]=st[j+1];
                    st[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i].info());

        }
    }
}
