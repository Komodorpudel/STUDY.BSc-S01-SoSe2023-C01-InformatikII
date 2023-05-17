import java.util.* // Needed for List and Collections

// Circle
public class Studenten<T extends Number & Comparable<T>>{ // Class uses T which must be subclass of Number and implement Comparable

    // Private Attribute
    private String name;
    private List <T> grade;

    // Konstruktor (immer gleicher name wie Class)
    public Studenten (String name, List<T> grade) {
        this.name = name;
        this.grade = grade;
    }

    // AverageGrade
    public double getAverageGrade() {
        // Initialize sum and length
        double gradeSum = 0.0;
        int length = numbers.size();

        for (T grade : grade) {
            gradeSum = gradeSum + grade;
        }



        // Return
        return Math.PI * radius * radius;
    }

    //getBestGrade
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}