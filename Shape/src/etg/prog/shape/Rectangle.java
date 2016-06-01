package etg.prog.shape;

public class Rectangle extends Shape {
    private double width;
    private double heigth;

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getArea() {
        return width * heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return heigth;
    }

}
