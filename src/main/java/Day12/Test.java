package Day12;

public class Test {
    public static void main(String[] args) {
        System.out.println("====");
        Cylinder cylinder = new Cylinder();
        cylinder.setLength(3.4);
        cylinder.setRadius(2.1);
        double volume = cylinder.findVolume();
        System.out.println("体积"+volume);

        double area = cylinder.findArea();
        System.out.println("面积"+area);


        System.out.println("===================");
        Cylinder cylinder1 = new Cylinder();
        double volume1 = cylinder1.findVolume();
        System.out.println("体积"+volume1);

    }
}
