import java.util.Scanner;

import static java.lang.Math.*;

public class Yravnenie {


    double a, b, c;
    boolean miss = false;

    public void launch() {

        checkAndScan();
        if (miss) {
            return;
        }
        counting(a, b, c);
    }


    private void checkAndScan() {



        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Введите коефициент а (не равный 0 )");
            this.a = sc.nextDouble();
            System.out.println("Введите коефициент в (не равный 0 )");
            this.b = sc.nextDouble();
            System.out.println("Введите коефициент c");
            this.c = sc.nextDouble();
        } catch (java.util.InputMismatchException e) {

            System.out.println("ВВОДИТЕ ЧИСЛА !!!");
            miss = true;
            return;
        }

        if (a == 0 || b == 0) {
            System.out.println("Коефициенты a,b не могут быть равны нулю !!!");
            miss = true;

        }


    }


    private void counting(double a, double b, double c) {

        double diferencial, x1, x2;
        diferencial = b * b - 4 * a * c;
        if (diferencial >= 0) {
            x1 = (b + sqrt(diferencial)) / (2 * a);
            x2 = (b - sqrt(diferencial)) / (2 * a);
            System.out.println("x1=" + x1);
            System.out.println("x2=" + x2);
            return;

        } else
            System.out.println("Дискриминант меньше нуля");

    }


}










