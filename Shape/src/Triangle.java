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
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        if (a + b <= c || a + c <= b || a + c <= b)
            System.out.println("Треугольник не существует");
        else {
            double p = (a + b + c) / 2.0;
            double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        }
        double p = (a + b + c) / 2.0;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
