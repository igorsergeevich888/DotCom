import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {

        int numOfGuesses = 0;

        SimpleDotCom dot = new SimpleDotCom();

        dot.setLocationCells(dot.location);

        Random rand = new Random();
        int number = rand.nextInt(5);

        for (int i = 0; i < 3; i++) {
            dot.location[i] = number;
            number++;
        }

        boolean isAlive = true;

        while (isAlive == true) {
            System.out.println("Vvedite chislo ot 0 do 6");
            Scanner sc = new Scanner(System.in);
            String num = sc.nextLine();
            String Resultat = dot.checkYourself(num);
            numOfGuesses++;
            if (Resultat == "Potopil") {
                isAlive = false;
                System.out.println(numOfGuesses);
            }

        }

    }
}
