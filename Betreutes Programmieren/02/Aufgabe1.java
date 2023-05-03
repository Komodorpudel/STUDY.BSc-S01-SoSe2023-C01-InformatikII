
// --------------------------------------

public abstract class Animal{

    // Attributes
    private String name;
    private int age;
    //

    // Constructor
    // -- Empty Constructor
    public Animal() {

    }

    // -- Constructor to set all attributes
    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }
    //

    // Methods
    // -- Setter name
    public void setName(String name) {
        this.name = name;
    }

    // -- Setter age
    public void setAge(int age) {
        this.age = age;
    }

    // -- Make Noise (abstract)
    public abstract void makeNoise();
    //
}

// --------------------------------------

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

 // --------------------------------------

 // Cat
public class Cat extends Animal {

    // Constructor
    public Cat(String name, int age){
        super(name, age);
    }

    // Override Make Noise
    public void makeNoise() {
        System.out.println("Meow");
    }
 }