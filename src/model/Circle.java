package model;

public class Circle {
    public static final double PI = 3.1;
    private static int count = 0;
    private String id;
    private double radius;

    public Circle() {
        count++;
        this.id = "C" + count;
    }

    public Circle(String id, double radius) {
        this.id = "C" + count;
        this.radius = radius;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id='" + id + '\'' +
                ", radius=" + radius +
                '}';
    }
}
