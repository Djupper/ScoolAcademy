package etg.prog.shape;

public class Square extends Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getArea() {

        return length * length;
    }

    public double getWidth() {
        return length;
    }

    public double getHeight() {
        return length;
    }

}



