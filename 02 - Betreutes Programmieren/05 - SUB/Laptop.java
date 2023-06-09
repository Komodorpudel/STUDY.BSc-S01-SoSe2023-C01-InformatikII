class Laptop extends Product {

    // --------------------------------------

    // Attribute
    private final String manufacturer;

    // --------------------------------------
    
    // Konstruktor
    public Laptop(String manufacturer, int ProductID, String name) throws IdAlreadyUsedException{
        super(name, ProductID);
        this.manufacturer = manufacturer;
    }

    // --------------------------------------

    // getManufacturer

    public String getManufacturer() {
        return manufacturer;
    }

    // --------------------------------------
    
}