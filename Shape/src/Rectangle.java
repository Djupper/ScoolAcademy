public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }

    public double getWidth() {
        return a;
    }

    public double getHeight() {
        return b;
    }

}
