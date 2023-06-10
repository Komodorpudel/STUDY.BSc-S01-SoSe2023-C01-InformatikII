import java.time.LocalDate;
import java.util.regex.Pattern;

public class BankAccount {

    // --------------------------------------

    // Attribute:
        /*  Bankkonten haben
                1. den Namen des Kontohalters,
                2. eine Kontonummer,
                3. ein Er¨offnungsdatum
                4. sowie einen Kontowert.

                1.a Der Name des Kontoinhabers ist eine Zeichenkette und muss aus mindestens einem Wort bestehen, das mit einem lateinischen Großbuchstaben beginnt, gefolgt von beliebig vielen lateinischen Kleinbuchstaben.
                1.b Der Name des Kontoinhabers kann aus mehreren Worten, getrennt durch Leerzeichen bestehen.
                1.c Der Name des Kontoinhabers kann jederzeit ge¨andert und gelesen werden.

                2.a Die Kontonummer ist eine Zeichenkette, die aus genau 12 Großbuchstaben und Ziffern besteht, z.B. "A12B34C56D78".
                2.b Die Kontonummer wird beim Erstellen des Bankkontos festgelegt und kann danach nicht mehr ge¨andertwerden. 
        */

    // 1.; 1.c
    private String accountHolderName;

    // 2.; 2.b 
    private final String accountNumber;

    // 3. 
    private final LocalDate openingDate;

    // 4.
    private double balance;


    // 1.a; 1.b
    private static final Pattern NAME_PATTERN = Pattern.compile("[A-Z][a-z]*(\\s[A-Z][a-z]*)*");

    // 2.a
    private static final Pattern ACCOUNT_NUMBER_PATTERN = Pattern.compile("[A-Z0-9]{12}"); 

    // --------------------------------------

    // Konstruktor:


        /*  3. Wird fur den Namen oder die Kontonummer ein ung ¨ ultiger Wert ¨ ubergeben, so wird ¨eine geeignete ungeprufte Ausnahme geworfen.
            4. Das Er ¨ ¨offnungsdatum entspricht dem Tag, an dem das Bankkonto erstellt wurde und kann nicht ge¨andert werden.
            5. Der Kontostand ist eine reelle Zahl und ist zu Beginn 0.
        */

    public BankAccount(String accountHolderName, String accountNumber) {
        if (!NAME_PATTERN.matcher(accountHolderName).matches()) {

            //3. 
            throw new IllegalArgumentException("Ungültiger Kontoinhabername.");
        }

        if (!ACCOUNT_NUMBER_PATTERN.matcher(accountNumber).matches()) { // 3.
            throw new IllegalArgumentException("Ungültige Kontonummer.");
        }

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        // 4.
        this.openingDate = LocalDate.now();
        // 5.
        this.balance = 0.0; 
    }

    // --------------------------------------

        /*      6. Danach kann der Kontostand sowohl erh¨oht als auch verringert werden.
                7. Alle Attribute des Bankkontos sind ¨offentlich lesbar.
                8. Zwei Bankkonten sind genau dann gleich, wenn ihre Kontonummern gleich sind.
                9. W¨ahlen Sie eine geeigneteDarstellung des Bankkontos als Zeichenkette.
        */

    public String getAccountHolderName() {
        return accountHolderName;
    }

    // --------------------------------------

    public void setAccountHolderName(String accountHolderName) {
        if (!NAME_PATTERN.matcher(accountHolderName).matches()) {
            throw new IllegalArgumentException("Ungültiger Kontoinhabername.");
        }
        this.accountHolderName = accountHolderName;
    }

    // --------------------------------------

    public String getAccountNumber() {
        return accountNumber;
    }

    // --------------------------------------

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    // --------------------------------------

    public double getBalance() {
        return balance;
    }

    // --------------------------------------

    public void addBalance(int amount) {
        this.balance += amount;
    }

    // --------------------------------------

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankAccount)) {
            return false;
        }
        BankAccount other = (BankAccount) obj;
        return accountNumber.equals(other.accountNumber);
    }

    // --------------------------------------

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }

    // --------------------------------------

    @Override
    public String toString() {
        return "BankAccount{ Kontoinhabername='" + accountHolderName + '\'' + ", Kontonummer='" + accountNumber + '\'' + ", Eröffnungsdatum=" + openingDate + ", Kontostand=" + balance + '}';
    }

    // --------------------------------------

}
