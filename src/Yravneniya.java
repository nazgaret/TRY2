import java.util.Scanner;

import static java.lang.Math.*;

public class Yravneniya {

    public static void main(String[] args) {


        System.out.println("Hello World!");

        double a, b, c, d, x1, x2;
        boolean isWrongNumber = false;


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

        if (a == 0 || b == 0) {
            isWrongNumber = true;
        }

        d = b * b - 4 * a * c;

        if (isWrongNumber == true) {
            System.out.println("Коефициенты a,b не могут быть равны нулю !!!");
            return;
        }

        if (d >= 0) {
            x1 = (b + sqrt(d)) / (2 * a);
            x2 = (b - sqrt(d)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);


        } else
            System.out.println("Дискриминант меньше нуля");
    }
}