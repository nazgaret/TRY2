package nazgaret;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/**
 * Created by student on 01.05.2016.
 */
public class Sort2 {
    private static final BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String str;
        String[] trash;
        trash = new String[100];
        int i=0;
        while (true) {
            System.out.println("Введите слово "+i);
            str = stdIn.readLine();
            if (str.length() == 0) break;
            str = str.replaceAll("\\ |\\-", "");
            trash[i] = str;
            System.out.println("Слово"+i+" : "+str);

            i++;
        }
        System.out.println("Введите разделитель");
        String razdel=stdIn.readLine();
        Arrays.sort(trash, 0,i);
        System.out.print(trash[0]);
        int l=1;
        while (l<i){
            System.out.print(razdel+trash[l]);
            l++;

        }

    }
}
