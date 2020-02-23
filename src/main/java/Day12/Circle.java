package Day12;




public class Circle {
    private double radius;




    public Circle() {
    //父类的空参构造器为空则子类的空参也报错，因为子类的空参中super()=====>找不到父类的空参构造器了
        radius=2;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double findArea(){
        double are=Math.PI*radius*radius;
        return are;
    }
}
