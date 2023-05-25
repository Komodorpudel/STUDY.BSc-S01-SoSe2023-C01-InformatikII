import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class A23_24d_main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter(Pattern.compile("[\\r\\n]+"));
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Geben Sie den Namen des Studenten ein:");
                String name = input.next();
                System.out.println("Geben Sie die Matrikelnummer des Studenten ein:");
                int matrikelNummer = input.nextInt();
                Student student = new Student(name, matrikelNummer);
                System.out.println(student);
            } catch (DuplicateException e) {
                System.out.println("Die Matrikelnummer existiert bereits.");
            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("Ungültige Eingabe");
            }
        }
        System.out.println("Geben Sie eine Matrikelnummer ein:");
        int matrikelNummer = input.nextInt();
        Student student = Student.getStudentByMatrikelNummer(matrikelNummer);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Es gibt keinen Studenten mit dieser Matrikelnummer.");
        }
    }
}
   
