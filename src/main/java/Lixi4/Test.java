package Lixi4;


import com.sun.org.apache.bcel.internal.generic.NEW;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Circle circle1 = new Circle("red", 1, 22);
        System.out.println(circle.getColor().equals(circle1.getColor()));
        System.out.println(circle.equals(circle1));
        System.out.println(circle.toString());
        System.out.println(circle1.toString());
    }

}
