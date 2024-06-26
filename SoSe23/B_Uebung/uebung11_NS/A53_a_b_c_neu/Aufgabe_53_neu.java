package SoSe23.B_Uebung.uebung11_NS.A53_a_b_c_neu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.sql.DriverManager;

public class Aufgabe_53_neu {

    public static void main(String [] args) {

        // Verbindungs-daten
        String url = "jdbc:mysql://educos-srv01.informatik.uni-augsburg.de:3306/theDatabase?useSSL=false&\serverTimezone=Europe/Berlin";
        String username = "student";
        String password = "inFormatik2"; 

        try(Connection myConnection = DriverManager.getConnection(url, username, password)) {

            System.out.println("Andreas" + getChoresDone (myConnection, "Andreas") + " Hours");

            System.out.println("Tobias chores Done:");
            choresDoneBeforeBirthday (myConnection, "Tobias", 2022);

        }

        catch (SQLException e) {

            e.printStackTrace();
        }

    }

    // --------------------------------------------------------------------------------------------

    public static double getChoresDone (Connection connection, String flatmate) throws SQLException {

        // Query vorbereiten - String
        String sqlQuery = "SELECT Chore.timeRequiredHours " +
                          "FROM Chore, FlatmateChore " +
                          "WHERE FlatmateChore.chore = Chore.chore " +
                          "AND FlatmateChore.name = ?";

        // Query vorbereiten und verbindung estabilishen
        try(PreparedStatement myStatement = connection.prepareStatement(sqlQuery)) {

            // Flatmate einsetzen
            myStatement.setString(1, flatmate);

            // Executen und Ergebnis bekommen
            ResultSet myResultSet = myStatement.executeQuery();

            // Summe berechnen
            float sum = 0;

            while (myResultSet.next()){

                sum = sum + myResultSet.getFloat("timeRequiredHours");
            }

            return sum; // verwandelt float into double;

        }

        catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return -1;
    }

    // --------------------------------------------------------------------------------------------

    public static void choresDoneBeforeBirthday (Connection connection, String flatmate, int year) {

        // Query vorbereiten
        String sqlQuery = "SELECT * " +
                          "FROM FlatmateChore, Flatmate " +
                          "WHERE Flatmate.name = FlatmateChore.name " +
                          "AND Flatmate.name = ?";

        try (PreparedStatement myStatement = connection.prepareStatement(sqlQuery)) {

            myStatement.setString(1, flatmate);

            ResultSet myResultSet = myStatement.executeQuery();

            while (myResultSet.next()){

                // Sobald ich in der ersten Zeile bin, kann ich bday abfragen
                // Ich setze den Bday auf das Jahr, welches übergeben wurde
                // LocalDate birthday = myResultSet.getDate("birthday").toLocalDate().withYear(year);
                LocalDate birthday = LocalDate.parse(myResultSet.getString("birthday")).withYear(year);

                // DoneAt als LocalDate
                LocalDate doneAt = LocalDate.parse(myResultSet.getString("doneAt"));

                // Jetzt liste ich Zeilweise jede Aufgabe auf, die eine Woche vor Bday gemacht wurde.

                if (doneAt.isBefore(birthday) && doneAt.isAfter(birthday.minusDays(7))){

                    System.out.println(myResultSet.getString("doneAt") + ": " + myResultSet.getString("chore"));
                }


            }

        }

        catch (SQLException e) {

            System.out.println(e.getMessage());

        }
            
    }

    // --------------------------------------------------------------------------------------------

    
}
