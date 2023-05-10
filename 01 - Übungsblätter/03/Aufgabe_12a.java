public class Aufgabe12a {
    
    public static void main(String[] args) {
        // Ein CharSequence-Array anlegen, das groß genug ist, um alle Kommandozeilenparameter aufzunehmen
        CharSequence[] charSequences = new CharSequence[args.length];

        // Mit der Klassenmethode arraycopy der System-Klasse die Kommandozeilenparameter in das angelegte CharSequence-Array kopieren
        System.arraycopy(args, 0, charSequences, 0, args.length);

        // Ein String-Objekt mit dem Wert "matik" anlegen, auf das eine CharSequence-Variable str zeigt
        CharSequence str = "matik";

        // Für jeden Eintrag des CharSequence-Arrays überprüfen, ob diese eine Teilzeichenkette enthalten, die str entspricht
        for (int i = 0; i < charSequences.length; i++) {
            CharSequence currentSequence = charSequences[i];
            int index = indexOfSubstring(currentSequence, str);

            // Im positiven Fall die jeweils erste Position des Vorkommens ausgeben
            if (index != -1) {
                System.out.printf("Die Teilzeichenkette '%s' wurde im Eintrag %d an der Position %d gefunden.\n", str, i, index);
            }
        }
    }
}

private static int indexOfSubstring(CharSequence source, CharSequence target) {
    int sourceLength = source.length();
    int targetLength = target.length();

    for (int i = 0; i <= sourceLength - targetLength; i++) {
        boolean match = true;
        for (int j = 0; j < targetLength; j++) {
            if (source.charAt(i + j) != target.charAt(j)) {
                match = false;
                break;
            }
        }

        if (match) {
            return i;
        }
    }

    return -1;
}