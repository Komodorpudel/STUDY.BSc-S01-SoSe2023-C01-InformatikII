import java.util.ArrayList;
import java.util.List;

public class Stammtisch {

    // --------------------------------------

    private List<Gast> gaeste = new ArrayList<>();

    // --------------------------------------

    // Methoden zum Hinzufügen von Gästen
    public void addGast(Gast gast) {
        if (gaeste.size() < 3) {
            gaeste.add(gast);
        }
    }
    
    // --------------------------------------

    public List<Gast> getGaeste() {
        return gaeste;
    }

    // --------------------------------------

}
