package Day13;

import org.omg.CORBA.PUBLIC_MEMBER;

public class GeometricObject {//几何图形
    String color;
    double weight;
    public double findAre(){
        return 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
}
class Circle extends GeometricObject{//圆
    double radius;
    public double findAre(){
        return Math.PI*radius*radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }
}
class MyRectangle extends GeometricObject{//矩形
    double width;
    double height;
    public double findAre(){
        return width*height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }
}