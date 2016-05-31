public class Main {
    public static void main(String[] args) {
        Shape s1 = new Square(5);
        System.out.println("Площадь квадрата " + s1.getArea());
        System.out.println("Высота " + s1.getHeight());
        System.out.println("Высота " + s1.getWidth());
        System.out.println();

        Shape t1 = new Triangle(2, 2, 3, 5, 6, 3);
        System.out.println("Прлощадь треугольника  " + t1.getArea());
        System.out.println("Треугольник высота " + t1.getHeight());
        System.out.println("Треугольник длинна " + t1.getWidth());
        System.out.println();
        Shape r1 = new Rectangle(2, 4);
        System.out.println("Прямоугольник ширина " + r1.getWidth());
        System.out.println("Прямоугольник высота " + r1.getHeight());
        System.out.println("Площадь прямоугольника  " + r1.getArea());
        System.out.println();
        Circle c1 = new Circle(2);
        System.out.println("Круг ширина " + c1.getHeight());
        System.out.println("Круг высота " + c1.getHeight());
        System.out.printf("Плозщадь круга " + "%.3f", c1.getArea());
    }
}


