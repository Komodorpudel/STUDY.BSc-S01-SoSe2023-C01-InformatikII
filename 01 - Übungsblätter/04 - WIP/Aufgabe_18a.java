import java.util.HashMap;
import java.util.Map;

public class Aufgabe_18a {

    // --------------------------------------

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        // Iterieren Sie über die Kommandozeilenparameter des Programms
        for (String param : args) {
            for (char c : param.toCharArray()) {
                // Berechnen Sie, wie oft jedes enthaltene Zeichen vorkommt
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        // Geben Sie für alle enthaltenen Zeichen die jeweilige Anzahl der Vorkommen aus
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Zeichen '" + entry.getKey() + "' kommt " + entry.getValue() + " mal vor.");
        }
    }

    // --------------------------------------

}
