import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Collection;

public class Aufgabe_18b {

    // --------------------------------------

    public static double averageRelativeDeltaFromMean(Map<Integer, Integer> map) {
        double sum = 0.0;
        for (Integer value : map.values()) {
            sum += value;
        }
        double avg = sum / map.size();
        double sumRelativeDeltas = 0.0;
        for (Integer value : map.values()) {
            sumRelativeDeltas += Math.abs(value - avg) / avg;
        }
        return sumRelativeDeltas / map.size();
    }

    // --------------------------------------

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Random rand = new Random();

        // initialisieren Sie die Werte für die Keys 0 bis 9 mit 0
        for (int i = 0; i < 10; i++) {
            map.put(i, 0);
        }

        // Berechnen Sie 10 zufällige Zahlen zwischen 0 und 9 und zählen Sie deren Vorkommen in Ihrer Map
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(10);
            map.put(num, map.get(num) + 1);
        }

        // Berechnen Sie die durchschnittliche relative Abweichung und geben diese aus
        double avgRelDelta = averageRelativeDeltaFromMean(map);
        System.out.println("Durchschnittliche relative Abweichung: " + avgRelDelta);

        // Erzeugen Sie dann so lange zufällige Zahlen zwischen 0 und 9, bis die durchschnittliche relative Abweichung weniger als 0.01 beträgt
        while (avgRelDelta >= 0.01) {
            int num = rand.nextInt(10);
            map.put(num, map.get(num) + 1);
            avgRelDelta = averageRelativeDeltaFromMean(map);
        }

        // Geben Sie dann die Anzahl der berechneten Zahlen aus
        int total = 0;
        for (int count : map.values()) {
            total += count;
        }
        System.out.println("Anzahl der berechneten Zahlen: " + total);
    }

    // --------------------------------------
    
}
