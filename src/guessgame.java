/**
 * Created by nazga on 18.12.2015.
 */
import java.util.Scanner;

import static java.lang.Math.*;

public class guessgame {
    public static void main(String[] args) {

        int b;
        int a = (int)(random()*99+1);

        System.out.println("Я ХОЧУ СЫГРАТЬ С ТОБОЙ В ИГРУ.");
        System.out.println("ТЫ ДОЛЖЕН КАКОЕ ЧИСЛО ОТ 1 ДО 100 Я ЗАГАДАЛ )");
        System.out.println("У ТЕБЯ ВСЕГО 10-ТЬ ПОПЫТОК");

        int x = 10;
        String s,s1,s2,s3;
        Scanner sc = new Scanner(System.in);

        s1 = "ЭТО СЛИШКОМ БОЛЬШОЕ ЧИСЛО! У ТЕБЯ ОСТАЛОСЬ";
        s2 = "ЭТО СЛИШКОМ МАЛЕНЬКОЕ ЧИСЛО! У ТЕБЯ ОСТАЛОСЬ";
        s3 = "КАК ТЫ СМОГ ПОБЕДИТЬ ? ЭТО ЖЕ НЕВОЗМОООЖНОООООООООО......";


        while (x>0) {
            x--;
            System.out.println("ПОПРОБУЙ УГАДАТЬ: ");
            try {
                b = (int)sc.nextDouble();
            }
            catch (java.util.InputMismatchException e) {

                System.out.println("ТЫ ПРОИГРАЛ !!!");
                return;
            }
            if (b==a){
                s=s3;
                System.out.println(s);
                return;
            }
            else if (b>a) {
                s=s1;
                System.out.println(b+" " +s+" "+ x +"ЖИЗНЕЙ!");
            }
            else {
                s = s2;
                System.out.println(b+" " +s+" "+ x +"ЖИЗНЕЙ!");
            }

        }

        System.out.println("ТЫ ПРОИГРАЛ !!!");





    }
}
