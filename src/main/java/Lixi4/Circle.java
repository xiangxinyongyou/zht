package Lixi4;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        color="white";
        radius=1;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }



    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
