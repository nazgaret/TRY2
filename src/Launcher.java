/**
 * Created by nazga on 20.12.2015.
 */
public class Launcher {
    public static void main(String[] args) {
        OOP human = new OOP(3);
        int out;
        out=human.summ(3,5);
        System.out.println(out);
        human.raceMozg(out);
        System.out.println(human.mozg);

        int minimal=0;
        int maximal=1000;
        GuessGame game = new GuessGame(minimal,maximal);
        game.launch();
    }

}
