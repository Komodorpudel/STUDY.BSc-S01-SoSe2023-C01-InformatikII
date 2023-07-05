import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySQLConnection {

    public static void main(String[] args) {
        // Ersetzen Sie diese Werte mit den richtigen Daten Ihrer MySQL-Datenbank
        String url = "jdbc:mysql://educos-srv01.informatik.uni-augsburg.de:3306/theDatabase?useSSL=false&\serverTimezone=Europe/Berlin\";
        String username = "student";
        String password = "inFormatik2";

        System.out.println("Connecting to the database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected successfully!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}
