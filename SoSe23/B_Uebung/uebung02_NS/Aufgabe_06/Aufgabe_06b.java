package SoSe23.B_Uebung.uebung02_NS.Aufgabe_06;

import java.util.Scanner;

// --------------------------------------

public class Aufgabe_06b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ganze Zahl zwischen 0 und 50 (einschließlich) ein:");
        
        if (scanner.hasNextInt() == false) {
            System.err.println("Die eingegebene Zahl ist kein Integer");

            System.exit(1);
        }

        int number = scanner.nextInt();
        System.out.println("Die eingegebene Zahl ist: " + number);

        scanner.close();

    }
}

// --------------------------------------