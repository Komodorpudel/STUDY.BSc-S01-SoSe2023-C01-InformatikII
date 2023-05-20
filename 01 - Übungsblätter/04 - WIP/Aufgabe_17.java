import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

public class Aufgabe_17 {

    // --------------------------------------

    public static String randomString(int n) {
        StringBuilder sb = new StringBuilder(n);
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            // zufälligen Groß- oder Kleinbuchstaben wählen
            char c = (rand.nextBoolean()) ? 
                      (char) (rand.nextInt(26) + 'A') : 
                      (char) (rand.nextInt(26) + 'a');
            sb.append(c);
        }
        return sb.toString();
    }

    // --------------------------------------

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Random rand = new Random();

        // Befüllen Sie myList mit 1000 zufälligen Zeichenketten mit Längen zwischen 3 und 7
        for (int i = 0; i < 1000; i++) {
            int length = rand.nextInt(5) + 3; // zufällige Länge zwischen 3 und 7
            myList.add(Aufgabe_17.randomString(length));
        }

        // Überprüfen Sie und geben Sie aus, ob myList die Zeichenkette "ABC" enthält.
        System.out.println("Enthält 'ABC': " + myList.contains("ABC"));

        // Erzeugen Sie ein Iterator-Objekt für myList und durchlaufen Sie alle Zeichenketten.
        // Summieren Sie dabei die Länge der Zeichenketten auf und geben diese Gesamtlänge aus.
        Iterator<String> iterator = myList.iterator();
        int gesamtlaenge = 0;
        while (iterator.hasNext()) {
            gesamtlaenge += iterator.next().length();
        }
        System.out.println("Gesamtlänge: " + gesamtlaenge);

        // Iterieren Sie mithilfe einer for-each-Loop über myList und geben Sie alle Zeichenketten der Länge 7 aus.
        for (String str : myList) {
            if (str.length() == 7) {
                System.out.println(str);
            }
        }
    }

    // --------------------------------------

}
