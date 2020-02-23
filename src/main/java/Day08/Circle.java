package Day08;

public class Circle {
    double r;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.r=8;
      //  circle.mianjei();
       double m= circle.mianjei1();
       System.out.println(m);


    }

    private double mianjei1() {
        double m=Math.PI*r*r;
        return m;
    }

//    public void mianjei() {
//        double mianji;
//        mianji=Math.PI*r*r;
//        System.out.println(mianji);
//    }
}
