public class Square extends Shape {

    private int length;

    public Square(int length) {
        this.length = length;
    }

    public double getArea() {

        return Math.pow(length, 2);
    }
    public double getWidth() {
        return length;
    }

    public double getHeight() {
        return length;
    }

}



