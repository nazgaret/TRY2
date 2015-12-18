import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello World!");

        double a, b, c, d, x1, x2, T;

        T = 0;

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Введите коефициент а");
            a = sc.nextDouble();
            System.out.println("Введите коефициент в");
            b = sc.nextDouble();
            System.out.println("Введите коефициент c");
            c = sc.nextDouble();
        } catch (java.util.InputMismatchException e) {

            System.out.println("ВВОДИТЕ ЧИСЛА !!!");
            return;
        }

        if (a == 0) {
            T = 1;
        }

        if (b == 0) {
            T = 1;
        }

        d = b * b - 4 * a * c;

        if (T == 1) {
            System.out.println("Коефициенты a,b не могут быть равны нулю !!!");

        } else if (d >= 0) {
            x1 = (b + sqrt(d)) / (2 * a);
            x2 = (b - sqrt(d)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);


        } else
            System.out.println("Дискриминант меньше нуля");
    }
}