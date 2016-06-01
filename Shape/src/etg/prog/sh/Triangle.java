package etg.prog.sh;

public class Triangle extends Shape {

    private int x1;
    private int x2;
    private int x3;
    private int y1;
    private int y2;
    private int y3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
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

        double a = getLength(x1, x2, y1, y2);
        double b = getLength(x1, x3, y1, y3);
        double c = getLength(x2, x3, y2, y3);

        double square;
        if (a + b <= c || a + c <= b || a + c <= b)
            square = 0;
        else {
            double semiperimeter = (a + b + c) / 2.0;
            square = Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));

        }
        return square;
    }

    private double getLength(int a1, int a2, int b1, int b2) {

        return Math.sqrt(Math.pow((a1 - a2), 2) + Math.pow((b1 - b2), 2));

    }
}
