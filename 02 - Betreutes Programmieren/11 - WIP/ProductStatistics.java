import java.util.List;
import java.util.stream.Collectors;

public class ProductStatistics {



    public static double calculateAveragePrice(List<Product> products) {
        return products.stream()
                        .mapToDouble(Product::getPrice)
                        .average()
                        .orElse(0);
    }

    public static List<Product> findMostExpensiveProducts(List<Product> products, int count) {
        return products.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()))
                .limit(count)
                .collect(Collectors.toList());
    }

    public static List<Product> findCheapestProducts(List<Product> products, int count) {
        return products.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .limit(count)
                .collect(Collectors.toList());
    }
}
