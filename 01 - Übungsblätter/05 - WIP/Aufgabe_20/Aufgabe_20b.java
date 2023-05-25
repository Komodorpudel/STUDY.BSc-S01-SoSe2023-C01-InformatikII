import java.util.Random;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7};
        Random random = new Random();
        IntSupplier supplier = () -> numbers[random.nextInt(4)];

        int sum = IntStream.generate(supplier)
                .limit(100)
                .reduce((a, b) -> a + b)
                .getAsInt();

        System.out.println("Summe: " + sum);
    }
}
