import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class A23_24b_main {
    public static void main(String[] args) {
        try {
            Student student = new Student("John Doe", 1234567);
            System.out.println(student);
            Scanner input = new Scanner(System.in);
            input.useDelimiter(Pattern.compile("[\\r\\n]+"));
            List<Student> studentList = new ArrayList<>();
            studentList.add(student);
            while (true) {
                try {
                    System.out.println("Geben Sie den Namen des Studenten ein:");
                    String name = input.next();
                    System.out.println("Geben Sie die Matrikelnummer des Studenten ein:");
                    int matrikelNummer = input.nextInt();
                    Student newStudent = new Student(name, matrikelNummer);
                    studentList.add(newStudent);
                } catch (IllegalArgumentException | InputMismatchException e) {
                    System.out.println("Ungültige Eingabe");
                    break;
                }
            }
            for (Student s : studentList) {
                System.out.println(s);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ungültige Eingabe");
        }
    }
}
