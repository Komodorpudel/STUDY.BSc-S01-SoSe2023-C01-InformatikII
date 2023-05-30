// Necessary packages/classes:
import java.util.HashMap;
import java.util.Map;
//

public class Student_c {

    // --------------------------------------

    // Atrribute:
    private String name;
    private int matrikelNummer;
    private static Map<Integer, Student_c> students = new HashMap<>();

    // --------------------------------------

    // Konstruktur:
    public Student_c(String name, int matrikelNummer) throws DuplicateException {
        // Man könnte auch this.name = name etc. verwenden,
        // aber dann wäre die Prüfung des Namens und Zeichenkette über set unten nicht möglich
        setName(name);
        setMatrikelNummer(matrikelNummer);

        // Teilaufgabe c: 1. Eine Ausnahme des Typs DuplicateException enth¨alt eine Fehlermeldung
        //                   [Attribute] already taken: [Value], wobei Attribute und Value dem Konstruktor
        //                   von DuplicateException als Zeichenketten ¨ubergeben werden.
        if (students.containsKey(matrikelNummer)) {
            throw new DuplicateException("Matrikelnummer", String.valueOf(matrikelNummer));
        }
        students.put(matrikelNummer, this);
    }

    // --------------------------------------

    // get Name
    public String getName() {
        return name;
    }

    // --------------------------------------

    // setName
    public void setName(String name) {
        if (name == null || name.trim().isEmpty() || !Character.isUpperCase(name.charAt(0))) {

            throw new IllegalArgumentException("Ungültiger Name");
        }
        this.name = name;
    }

    // --------------------------------------

    // getMatrikelNummber
    public int getMatrikelNummer() {
        return matrikelNummer;
    }

    // --------------------------------------


    // setMatrikelNummber
    public void setMatrikelNummer(int matrikelNummer) {
        if (matrikelNummer < 1000000 || matrikelNummer > 9999999) {
            throw new IllegalArgumentException("Ungültige Matrikelnummer");
        }
        this.matrikelNummer = matrikelNummer;
    }

    // --------------------------------------

    // getStudentbyMatrikelNummer
    public static Student_c getStudentByMatrikelNummer(int matrikelNummer) {
        return students.get(matrikelNummer);
    }

    // --------------------------------------

    // toString
    @Override
    public String toString() {
        return "(" + matrikelNummer + ", " + name + ")";
    }

    // --------------------------------------

}


