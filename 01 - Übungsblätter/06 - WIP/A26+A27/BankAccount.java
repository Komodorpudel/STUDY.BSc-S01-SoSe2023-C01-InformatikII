// Necessary packages/classes:
import java.time.LocalDate;
import java.util.regex.Pattern;
//

public class BankAccount {

    // --------------------------------------

    // Attribute:

    // 1. den Namen des Kontohalters
    // 1.a Der Name des Kontoinhabers ist eine Zeichenkette und muss aus mindestens einem Wort bestehen, das mit einem lateinischen Großbuchstaben beginnt, gefolgt von beliebig vielen lateinischen Kleinbuchstaben.
    // 1.b Der Name des Kontoinhabers kann aus mehreren Worten, getrennt durch Leerzeichen bestehen.
    // 1.c Der Name des Kontoinhabers kann jederzeit ge¨andert und gelesen werden. (SAH: Nicht final; Hat auch unten Einfluss, da getter und setter verfügbar)
    private String accountHolderName;
    private static final Pattern NAME_PATTERN = Pattern.compile("[A-Z][a-z]*(\\s[A-Z][a-z]*)*");

    // 2. eine Kontonummer,
    // 2.a Die Kontonummer ist eine Zeichenkette, die aus genau 12 Großbuchstaben und Ziffern besteht, z.B. "A12B34C56D78".
    // 2.b Die Kontonummer wird beim Erstellen des Bankkontos festgelegt und kann danach nicht mehr ge¨andertwerden. 
    private final String accountNumber;
    private static final Pattern ACCOUNT_NUMBER_PATTERN = Pattern.compile("[A-Z0-9]{12}"); 

    // 3. ein Er¨offnungsdatum
    private final LocalDate openingDate;

    // 4. sowie einen Kontowert.
    private double balance;

    // --------------------------------------

    // Konstruktor:
    public BankAccount(String accountHolderName, String accountNumber) {

        // 5. Wird fur den Namen (oder die Kontonummer) ein ung ¨ ultiger Wert ¨ ubergeben, so wird ¨eine geeignete ungeprufte Ausnahme geworfen. (SAH: Siehe setAccountHolderName methode)
        setAccountHolderName(accountHolderName);

        // 5. Wird fur (den Namen oder) die Kontonummer ein ung ¨ ultiger Wert ¨ ubergeben, so wird ¨eine geeignete ungeprufte Ausnahme geworfen.
        if (!ACCOUNT_NUMBER_PATTERN.matcher(accountNumber).matches()) {
            throw new IllegalArgumentException("Ungültige Kontonummer.");
        }

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

        // 6. Das Er ¨ ¨offnungsdatum entspricht dem Tag, an dem das Bankkonto erstellt wurde und kann nicht ge¨andert werden.
        this.openingDate = LocalDate.now();
        
        // 7. Der Kontostand ist eine reelle Zahl und ist zu Beginn 0.
        this.balance = 0.0; 
    }

    // --------------------------------------

    // 8. Alle Attribute des Bankkontos sind ¨offentlich lesbar. (SAH: Siehe Getter unten)

    // 8.a get
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // --------------------------------------

    // 8.b get
        public String getAccountNumber() {
        return accountNumber;
    }

    // --------------------------------------

    // 8.c get
    public LocalDate getOpeningDate() {
        return openingDate;
    }

    // --------------------------------------

    // 8.d get
    public double getBalance() {
        return balance;
    }

    // --------------------------------------

    // 1.c Der Name des Kontoinhabers kann jederzeit ge¨andert und gelesen werden. (SAH: wird auch von Konstruktor verwendet)
    public void setAccountHolderName(String accountHolderName) {

        // 5. Wird fur den Namen (oder die Kontonummer) ein ung ¨ ultiger Wert ¨ ubergeben, so wird ¨eine geeignete ungeprufte Ausnahme geworfen.
        if (!NAME_PATTERN.matcher(accountHolderName).matches()) {
            throw new IllegalArgumentException("Ungültiger Kontoinhabername.");
        }
        this.accountHolderName = accountHolderName;
    }

    // --------------------------------------

    // 9. Danach kann der Kontostand sowohl erh¨oht als auch verringert werden.
    public void addBalance(double amount) {
        this.balance = this.balance + amount;
    }

    // --------------------------------------

    // 10. Zwei Bankkonten sind genau dann gleich, wenn ihre Kontonummern gleich sind.
    @Override
    public boolean equals(Object obj) {

        // First step: Check for reference equality (Not needed but can improve performance)
        //             "In general, it's good practice to use this as a quick initial check in the equals() method.
        //             It's a low-cost operation that can sometimes avoid a potentially more expensive comparison process."
        if (this == obj) {
            return true;
        }

        // Second step: Check if object is of type BankAccount
        //              Also avoids problem of potentially casting object that is not BankAccount below in third step
        if (!(obj instanceof BankAccount)) {
            return false;
        }
        
        // Third step: Check if accountNumber is identical
        //             and return
        BankAccount other = (BankAccount) obj;
        return accountNumber.equals(other.accountNumber);
    }

    // --------------------------------------

    // "It is generally a good practice to override the hashCode method when you override the equals method, and vice versa.
    // This is because the contract of hashCode is designed to work in conjunction with equals."

    // SAH: Not overriding this could mean that two bankAccounts are identical accoording to equals() method but have different hashes -> Not consistent

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }

    // --------------------------------------

    // 11. W¨ahlen Sie eine geeigneteDarstellung des Bankkontos als Zeichenkette.
    @Override
    public String toString() {
        return "BankAccount (Kontoinhabername = '" + accountHolderName + '\'' + ", Kontonummer = '" + accountNumber + '\'' + ", Eröffnungsdatum = " + openingDate + ", Kontostand = " + balance + ')';
    }

    // --------------------------------------

}
