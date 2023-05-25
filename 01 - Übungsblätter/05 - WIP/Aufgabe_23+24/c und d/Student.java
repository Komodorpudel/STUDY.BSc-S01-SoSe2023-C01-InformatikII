// Necessary packages/classes:
import java.util.HashMap;
import java.util.Map;
//

public class Student {

    // --------------------------------------

    private String name;
    private int matrikelNummer;
    private static Map<Integer, Student> students = new HashMap<>();

    // --------------------------------------

    public Student(String name, int matrikelNummer) throws DuplicateException {
        setName(name);
        setMatrikelNummer(matrikelNummer);
        if (students.containsKey(matrikelNummer)) {
            throw new DuplicateException("Matrikelnummer", String.valueOf(matrikelNummer));
        }
        students.put(matrikelNummer, this);
    }

    // --------------------------------------

    public String getName() {
        return name;
    }

    // --------------------------------------

    public void setName(String name) {
        if (name == null || name.trim().isEmpty() || !Character.isUpperCase(name.charAt(0))) {
            throw new IllegalArgumentException("Ungültiger Name");
        }
        this.name = name;
    }

    // --------------------------------------

    public int getMatrikelNummer() {
        return matrikelNummer;
    }

    // --------------------------------------

    public void setMatrikelNummer(int matrikelNummer) {
        if (matrikelNummer < 1000000 || matrikelNummer > 9999999) {
            throw new IllegalArgumentException("Ungültige Matrikelnummer");
        }
        this.matrikelNummer = matrikelNummer;
    }

    // --------------------------------------

    public static Student getStudentByMatrikelNummer(int matrikelNummer) {
        return students.get(matrikelNummer);
    }

    // --------------------------------------

    @Override
    public String toString() {
        return "(" + matrikelNummer + ", " + name + ")";
    }

    // --------------------------------------

}


