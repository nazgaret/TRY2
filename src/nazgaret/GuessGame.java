package nazgaret;

import java.util.Scanner;

import static java.lang.Math.*;

public class GuessGame {

    public static final String NUMBER_TO_BIG = "ЭТО СЛИШКОМ БОЛЬШОЕ ЧИСЛО! У ТЕБЯ ОСТАЛОСЬ";
    public static final String NUMBER_TO_LOW = "ЭТО СЛИШКОМ МАЛЕНЬКОЕ ЧИСЛО! У ТЕБЯ ОСТАЛОСЬ";
    public static final String YOU_WIN = "КАК ТЫ СМОГ ПОБЕДИТЬ ? ЭТО ЖЕ НЕВОЗМОООЖНОООООООООО......";
    private int tryNumber = 10;

    int win = 0;

    public void launch() {

// Вызоы метода генерации случайного числа по уже заданным границам / начало игры.
        int random = generateRandom();


        System.out.println("Я ХОЧУ СЫГРАТЬ С ТОБОЙ В ИГРУ.");
        System.out.println("ТЫ ДОЛЖЕН УГАДАТЬ КАКОЕ ЧИСЛО ОТ " + minimal + " ДО " + maximal + " Я ЗАГАДАЛ )");
        System.out.println("У ТЕБЯ ВСЕГО 10-ТЬ ПОПЫТОК");

        // Остались попытки ? пробуем еще

        while (tryNumber > 0) {
            if (win == 0) {
                doOneTry(random);

            } else return;

            //нет ? = проиграл


        }
        System.out.println("ТЫ ПРОИГРАЛ !!!");
    }

    private void doOneTry(int random) {

        int scanNumber;
        tryNumber--;


        System.out.println("ПОПРОБУЙ УГАДАТЬ: ");

        try {
            scanNumber = scanNumber();

        } catch (java.util.InputMismatchException e) {

            System.out.println("НЕВЕРНЫЙ ВВОД !!!");
            return;
        }
        if (scanNumber == random) {

            System.out.println(YOU_WIN);
            win = 1;
            tryNumber += 1;
            return;
        }
        if (scanNumber > random) {

            System.out.println(scanNumber + " " + NUMBER_TO_BIG + " " + tryNumber + " ЖИЗНЕЙ!");
        } else {

            System.out.println(scanNumber + " " + NUMBER_TO_LOW + " " + tryNumber + " ЖИЗНЕЙ!");
        }

    }

    private int scanNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private int generateRandom() {
        return (int) (random() * (maximal - minimal) + minimal);
    }

    public GuessGame(int minimal1, int maximal1) {
        this.minimal = minimal1;
        this.maximal = maximal1;

    }

    private int minimal;
    private int maximal;
}
