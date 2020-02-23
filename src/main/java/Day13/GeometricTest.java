package Day13;

public class GeometricTest {

    public boolean equalsArea(GeometricObject g,GeometricObject j) {
        return g.findAre()==j.findAre();

    }
    public double displayGeometricObject(GeometricObject c){
        double are = c.findAre();
       // System.out.println(are);
        return are;
    }


    public static void main(String[] args) {
        GeometricTest geometricTest = new GeometricTest();
        Circle c1 = new Circle("", 1, 3);
        Circle c2 = new Circle("", 1, 9);
        boolean b = geometricTest.equalsArea(c1, c2);
        System.out.println("两个的面积是否相等"+b);
        System.out.println("==============");
        Circle h = new Circle("", 1, 3 );

        geometricTest.displayGeometricObject(h);

        MyRectangle myRectangle = new MyRectangle("", 1, 3, 5);
        MyRectangle myRectangle1 = new MyRectangle("", 1, 3, 59);
        boolean b1 = geometricTest.equalsArea(myRectangle, myRectangle1);
        System.out.println(b1);
        double v = geometricTest.displayGeometricObject(myRectangle1);
        System.out.println(v);
    }
}
