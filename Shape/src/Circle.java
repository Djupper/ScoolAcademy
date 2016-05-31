public class Circle extends Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
    public double getHeight() {
        return r*2;
    }
    public double getWidth() {
        return r*2;
    }
}
