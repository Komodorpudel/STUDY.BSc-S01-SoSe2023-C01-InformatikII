import java.util.List;
import java.util.ArrayList;

public class main {

    // --------------------------------------
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
/* 
        animals.add(new Dog("Fido", 3));
        animals.add(new Cat("Fluffy", 2));
        animals.add(new Cat("Kitty", 99));
        animals.add(new Dog("Lassie", 666));


        makeAllNoises(animals);
 */

    }

    // --------------------------------------
    
    // makeALlNoises
    public static void makeAllNoises(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.makeNoise();
        }
    }

    //GetAllInformation
}
