import java.util.List;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
import java.util.Random;

public class Aufgabe_19b {

    // --------------------------------------

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // --------------------------------------

    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            list.add(rand.nextInt(10000));
        }
        UnaryOperator<Integer> squareIfEven = i -> i % 2 == 0 ? i * i : i;
        list.replaceAll(squareIfEven);
        Predicate<Integer> isNotPrime = i -> !isPrime(i);
        list.removeIf(isNotPrime);
        list.forEach(System.out::println);
    }

    // --------------------------------------

}
