package blatt06;

public class A2627_main {

    // --------------------------------------

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Max Mustermann", "DE0123456789");
        ba1.addBalance(20);
        ba1.addBalance(-13);
        System.out.println("Bankkonto von " + ba1.getAccountHolderName() + " mit Kontonummer "
                + ba1.getAccountNumber() +  " am " + ba1.getOpeningDate() + " eroeffnet.");
        System.out.println("Aktueller Kontostand: " + ba1.getBalance());
        System.out.println("Zeichenketten-Darstellung des Kontos:");
        System.out.println(ba1);
        try {
            BankAccount ba2 = new BankAccount("FalscheR Test1 naMe", "5R9S3B2N0Q7");
            System.out.println("Ueberpruefung des Namen fehlgeschlagen!");
        } catch (IllegalArgumentException e) {
            System.out.println("Falscher Name führt zu folgender Fehlermeldung: " + e.getMessage());
        }

        try {
            BankAccount ba2 = new BankAccount("Gueltiger Name", "5R9S3a2N0Q7");
            System.out.println("Ueberpruefung der Kontonummer fehlgeschlagen!");
        } catch (IllegalArgumentException e) {
            System.out.println("Falsche Kontonummer führt folgender Fehlermeldung: " + e.getMessage());
        }
    }

    // --------------------------------------
    
}
