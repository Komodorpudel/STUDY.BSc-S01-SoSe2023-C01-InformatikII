import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;

public class Aufgabe_19a {

    // --------------------------------------

    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        UnaryOperator<String> toUpperCase = String::toUpperCase;
        list.replaceAll(toUpperCase);
        Predicate<String> startsWithA = s -> s.startsWith("A");
        list.removeIf(startsWithA);
        list.forEach(System.out::println);
    }

    // --------------------------------------

}