package Day09;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class Circle {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        double area=Math.PI*radius*radius;
        return area;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(3);
        double radius = c.getRadius();
        System.out.println(radius);
    }
}