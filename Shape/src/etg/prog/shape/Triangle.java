package etg.prog.shape;

public class Triangle extends Shape {

    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double getWidth() {
        return (Math.max(Math.max(x1, x2), x3)) - (Math.min(Math.min(x1, x2), x3));
    }

    public double getHeight() {
        return (Math.max(Math.max(y1, y2), y3)) - (Math.min(Math.min(y1, y2), y3));
    }

    public double getArea() {

        double a = getLength(x1, y1, x1, y2);
        double b = getLength(x1, y3, x3, y3);
        double c = getLength(x2, y2, x2, y3);

        double square;
        if (a + b <= c || a + c <= b || a + c <= b) {
            square = 0;

        } else {
            double semiPerimeter = (a + b + c) / 2.0;
            square = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

        }
        return square;
    }

    private static double getLength(double coordinateX1, double coordinateY1, double coordinateX2, double coordinateY2) {

        return Math.sqrt(Math.pow((coordinateX1 - coordinateX2), 2) + Math.pow((coordinateY1 - coordinateY2), 2));

    }
}
