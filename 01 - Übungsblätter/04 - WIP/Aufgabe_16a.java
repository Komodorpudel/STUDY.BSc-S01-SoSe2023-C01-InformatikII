import java.time.LocalDate;
import java.time.Period;

public class Aufgabe_16a {

    // --------------------------------------
    public static void main(String[] args) {
        
        // Erstellen Sie ein LocalDate-Objekt für das aktuelle Datum
        LocalDate heute = LocalDate.now();

        // Erstellen Sie ein LocalDate-Objekt für den vorläufigen Termin der ersten Klausur
        // Zum Beispiel, hier setze ich den Termin auf 2023-09-01
        LocalDate klausurtermin = LocalDate.of(2023, 9, 1);

        // Erstellen Sie ein Period-Objekt, das die Zeitspanne vom aktuellen Datum zum Prüfungstermin enthält
        Period bisZurKlausur = Period.between(heute, klausurtermin);

        // Die verbleibenden Monate und Tage auf der Kommandozeile ausgeben
        System.out.println("Verbleibende Monate: " + bisZurKlausur.getMonths());
        System.out.println("Verbleibende Tage: " + bisZurKlausur.getDays());
    }

    // --------------------------------------
}
