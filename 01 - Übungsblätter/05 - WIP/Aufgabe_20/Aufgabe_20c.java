import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Character> charSupplier = () -> (char) ('a' + random.nextInt(26));
        Supplier<String> stringSupplier = () -> {
            int length = 5 + random.nextInt(6);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < length; i++) {
                sb.append(charSupplier.get());
            }
            return sb.toString();
        };

        double averageLength = Stream.generate(stringSupplier)
                .limit(500)
                .mapToInt(String::length)
                .average()
                .orElseThrow();

        System.out.println("Durchschnittliche Länge: " + averageLength);
    }
}
