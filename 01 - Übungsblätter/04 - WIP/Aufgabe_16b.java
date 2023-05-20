import java.time.LocalDate;
import java.time.DayOfWeek;

public class Aufgabe_16b {

    // --------------------------------------

    public static void main(String[] args) {

        // aktuelles Datum holen
        LocalDate heute = LocalDate.now();

        // Anzahl der Tage bis zum Monatsende bestimmen
        LocalDate monatsende = heute.withDayOfMonth(heute.lengthOfMonth());
        int tageBisMonatsende = monatsende.getDayOfMonth() - heute.getDayOfMonth();
        
        // Ausgabe der Anzahl der Tage bis zum Monatsende
        System.out.println("Tage bis Monatsende: " + tageBisMonatsende);
        
        // Samstage und Sonntage zählen
        int samstage = 0, sonntage = 0;
        for (LocalDate date = heute; date.isBefore(monatsende.plusDays(1)); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                samstage++;
            } else if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sonntage++;
            }
        }
        
        // Ausgabe der Anzahl der Samstage und Sonntage
        System.out.println("Verbleibende Samstage: " + samstage);
        System.out.println("Verbleibende Sonntage: " + sonntage);
    }

    // --------------------------------------

}
