// Necessary packages/classes:
import java.util.HashMap;
import java.util.Map;
//

public class UniqueStudent extends Student {

    // --------------------------------------

    private static Map<Integer, UniqueStudent> students = new HashMap<>();

    // --------------------------------------

    public UniqueStudent(String name, int matrikelNummer) throws DuplicateException {
        super(name, matrikelNummer);
        if (students.containsKey(matrikelNummer)) {
            throw new DuplicateException("Matrikelnummer", String.valueOf(matrikelNummer));
        }
        students.put(matrikelNummer, this);
    }

    // --------------------------------------

    public static UniqueStudent getByMatrikelNummer(int matrikelNummer) {
        return students.get(matrikelNummer);
    }

    // --------------------------------------

}
