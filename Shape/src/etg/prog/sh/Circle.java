package etg.prog.sh;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return radius * 2;
    }
}
