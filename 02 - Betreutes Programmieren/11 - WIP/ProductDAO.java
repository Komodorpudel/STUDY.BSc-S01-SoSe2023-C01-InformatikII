import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    // --------------------------------------

    // Attribute
    private Connection connection;

    // --------------------------------------

    // Konstruktor
    public ProductDAO() {
        String url = "jdbc:mysql://educos-srv01.informatik.uni-augsburg.de:3306/theDatabase?useSSL=false&\serverTimezone=Europe/Berlin";
        String username = "student";
        String password = "inFormatik2";
        
        try {
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("In ProductDAO: Connected successfully!\n\n");
        }
        
        catch (SQLException e) {
            System.out.println("In ProductDAO: Failed to connect to the database.");
            e.printStackTrace();
        }
    }

    // --------------------------------------

    // getAllProducts
    public List<Product> getAllProducts() {

        // Empty list for all products
        List<Product> products = new ArrayList<>();

        // Query that i send to SQL
        String query = "SELECT * FROM Product";

        // try with
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            // Go through rows
            while (rs.next()) {

                // get id, name, price
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");

                // add to array products
                products.add(new Product(id, name, price));
            }
        }
        
        catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    // --------------------------------------

    // updateProductPrice
    public void updateProductPrice(int productId, double newPrice) {

        // my SQL query
        String query = "UPDATE Product SET price = ? WHERE id = ?";

        // try with
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            
            pstmt.setDouble(1, newPrice);
            pstmt.setInt(2, productId);
            
            int updated = pstmt.executeUpdate();
            if (updated > 0) {
                System.out.println("Product price updated successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // --------------------------------------

}
