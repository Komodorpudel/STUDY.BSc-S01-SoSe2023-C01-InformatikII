import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void main(String[] args) {
        // Erstellen eines ProductDAO-Objekts
        ProductDAO productDAO = new ProductDAO("jdbc:mysql://localhost:3306/yourdb", "username", "password");
        
        // Holen aller Produkte
        List<Product> products = productDAO.getAllProducts();

        // Berechnung und Ausgabe des durchschnittlichen Preises
        double averagePrice = ProductStatistics.calculateAveragePrice(products);
        System.out.println("Durchschnittspreis: " + averagePrice);

        // Ermittlung und Ausgabe der drei günstigsten Produkte
        List<Product> cheapestProducts = ProductStatistics.findCheapestProducts(products, 3);
