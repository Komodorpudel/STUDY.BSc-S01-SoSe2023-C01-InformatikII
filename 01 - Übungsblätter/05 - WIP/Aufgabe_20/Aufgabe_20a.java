// Necessary packages/classes:
import java.util.Random;
import java.util.stream.IntStream;
//

public class Aufgabe_20a {

    // --------------------------------------

    public static void main(String[] args) {
        Random random = new Random();
        int sum = random.ints(0, 100)
                .limit(1000)
                .map(n -> n / 10)
                .distinct()
                .sum();

        System.out.println("Summe: " + sum);
    }

    // --------------------------------------

}