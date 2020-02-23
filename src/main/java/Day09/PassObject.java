package Day09;


import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.util.calendar.LocalGregorianCalendar;

import java.util.ArrayList;
import java.util.Date;

public class PassObject {

    public void PrintAreas(Circle c, int time) {
        int i = 1;
        for (; i <= time; i++) {
//给圆的半径复制
            c.radius = i;

            double area = c.findArea();

            System.out.println("半径是" + c.radius + "面积是" + area);
        }
        c.radius = i;


    }

    public static void main(String[] args) {
        PassObject ps = new PassObject();
        Circle circle = new Circle();
        ps.PrintAreas(circle, 6);
        System.out.println("no redie is:" + circle.radius);
        circle.setRadius(4);
        double are = circle.getRadius() * circle.getRadius() * Math.PI;
        System.out.println("我的面积是" + are);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList1 = new ArrayList();


    }
}
