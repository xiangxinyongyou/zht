package Day12;

import com.sun.org.apache.regexp.internal.RE;

public class Cylinder extends Circle {
    private double length;

//    public Cylinder() {
//       //  super();//默认存在
//        length = 1;
//    }

    public double findVolume() {
        //错误
        //获取的是初始化的值，赋值的数没有获取到，因为new
//                Circle circle = new Circle(); //用的是空参的构造器
//        System.out.println(circle.getRadius());
//        double v=length*circle.getRadius()*circle.getRadius()*Math.PI;
//        return v;
//        double v = length * Math.PI * getRadius() * getRadius();
//        //换中方式
        double v1=length*findArea();
        return v1;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
