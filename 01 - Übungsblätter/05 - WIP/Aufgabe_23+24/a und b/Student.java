public class Student {
    private String name;
    private int matrikelNummer;

    public Student(String name, int matrikelNummer) {
        setName(name);
        setMatrikelNummer(matrikelNummer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty() || !Character.isUpperCase(name.charAt(0))) {
            throw new IllegalArgumentException("Ungültiger Name");
        }
        this.name = name;
    }

    public int getMatrikelNummer() {
        return matrikelNummer;
    }

    public void setMatrikelNummer(int matrikelNummer) {
        if (matrikelNummer < 1000000 || matrikelNummer > 9999999) {
            throw new IllegalArgumentException("Ungültige Matrikelnummer");
        }
        this.matrikelNummer = matrikelNummer;
    }

    @Override
    public String toString() {
        return "(" + matrikelNummer + ", " + name + ")";
    }
}
