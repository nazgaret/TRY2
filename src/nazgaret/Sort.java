package nazgaret;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by student on 01.05.2016.
 */
public class Sort {
    private static final BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        System.out.println("Введите строку");
        String text = stdIn.readLine();
        //String text = "s;ljbvljsdv 21 2 35 5 45 65656 542 2 34 23pkdsjfjsd s;dkf ds jf;dsj ;fjsd; jflsdj f;l";
        String[] array;
        array = text.split(" ");
        String ex = "";
        int[] numbers = new int[100];
        String[] words = new String[100];
        int numbersInd = 0;
        int wordsInd = 0;

        int i = 0;
        while (i < array.length) {
            if (array[i].length() == 0) {
                i++;
                continue;
            }
            try {
                numbers[numbersInd] = Integer.parseInt(array[i]);
                numbersInd++;

            } catch (NumberFormatException e) {
                words[wordsInd] = array[i];
                wordsInd++;

            }

            i++;
        }

        Arrays.sort(numbers, 0,numbersInd );
        int counterNum = 0;
        while (counterNum < numbersInd) {
            System.out.println(numbers[counterNum]);
            counterNum++;


        }
        System.out.println();
        Arrays.sort(words, 0,wordsInd );
        int counterWords = 0;
        while (counterWords < wordsInd) {
            System.out.println(words[counterWords]);
            counterWords++;


        }
    }
}