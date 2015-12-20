/**
 * Created by nazga on 20.12.2015.
 */
public class OOP {
    int mozg = 0;

    public OOP(int mozg2) {

        mozg = mozg2;

    }
    public int summ(int firstNumber, int secondNumber){

        int summ=firstNumber+secondNumber+mozg;
        return summ;
    }

    public void raceMozg(int out) {
        mozg+=out;


    }
}
