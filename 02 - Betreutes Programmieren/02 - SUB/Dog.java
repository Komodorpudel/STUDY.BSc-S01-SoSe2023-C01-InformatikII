// Dog
public class Dog extends Animal {

    // Constructor
    public Dog(String name, int age){
        super(name, age);
    }

    // Override Make Noise
    public void makeNoise() {
        System.out.println("Woof");
    }
 }