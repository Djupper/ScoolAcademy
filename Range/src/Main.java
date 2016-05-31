import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("Введите начало и конец");
        int from = s.nextInt();
        int to = s.nextInt();
        Range range = new Range(from, to);
        System.out.println("Ваш диапазон " + range.calcLength());
        if (range.isInside(a) == true) {
            System.out.println("Число лежит в диапазоне!");
        } else {
            System.out.println("Число НЕ лежит в диапазоне!");
        }

    }
}

