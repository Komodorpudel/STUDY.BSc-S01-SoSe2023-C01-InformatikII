package SoSe23.B_Uebung.uebung02_NS.Aufgabe_06;

import java.util.Scanner;

// --------------------------------------

public class Aufgabe_06a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ganze Zahl zwischen 0 und 50 (einschließlich) ein:");
        
        int number = scanner.nextInt();
        System.out.println("Die eingegebene Zahl ist: " + number);

        scanner.close();
    }
}

// --------------------------------------

// Frage: Was passiert, wenn Sie etwas anderes als eine ganze Zahl eingeben?

// Antwort: Wenn Sie etwas anderes als eine ganze Zahl eingeben, wird eine InputMismatchException ausgelöst.
