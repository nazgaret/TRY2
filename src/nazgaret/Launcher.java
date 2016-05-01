package nazgaret;

import java.util.Scanner;

public class Launcher {


    public static void main(String[] args) {
        OOP human = new OOP(3);
        int out;
        out = human.summ(3, 5);
        System.out.println(out);
        human.raceMozg(out);
        System.out.println(human.mozg);
        System.out.println();
        System.out.println();

        System.out.println("Выберите игру 1/2 :");
        Scanner sc = new Scanner(System.in);
        int gameNumber;
        try {
            gameNumber = sc.nextInt();
        } catch (java.util.InputMismatchException e) {

            System.out.println("ВВОДИТЕ ЧИСЛА !!!");
            return;
        }
        if (gameNumber == 1) {
            int minimal = 0;
            int maximal = 1000;

            GuessGame game = new GuessGame(minimal, maximal);
            game.launch();
        } else {
            if (gameNumber == 2) {
                Yravnenie yravnenie1 = new Yravnenie();
                yravnenie1.launch();

            } else {
                System.out.println("Введите 1 / 2 !");
                return;
            }
        }
    }
}
