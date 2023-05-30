// 1. Erstellen Sie eine eigene gepr¨ufte Ausnahme DuplicateException als Unterklasse
//    von Exception.

public class DuplicateException extends Exception {

    // --------------------------------------

    public DuplicateException(String attribute, String value) {
        super(attribute + " already taken: " + value);
    }

    // --------------------------------------
    
}