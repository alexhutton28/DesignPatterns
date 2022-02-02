import java.util.ArrayList;

/**
 * A car that has a make model and can have any of given accessories.
 */
public abstract class Car {
    protected String make;
    protected String model;
    protected ArrayList<Accessories> accessories = new ArrayList<Accessories>();

    /**
     * Creates an instance of car with the given make and model
     * 
     * @param make  the make of the car
     * @param model the model of the car
     */
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    /**
     * Assembles the car by calling all of the required methods to build the car
     */
    public void assemble() {
        System.out.println("Creating a " + make + " " + model);
        this.addFrame();
        this.addWheels();
        this.addEngine();
        this.addWindows();
        this.addAccessories();
        this.displayAccessories();
    }

    protected abstract void addFrame();

    /**
     * Adds wheels
     */
    protected void addWheels() {
        System.out.println("Adding the Wheels");
    }

    /**
     * Adds the standard engine
     */
    protected void addEngine() {
        System.out.println("Adding a Standard Engine");
    }

    /**
     * Adds windows
     */
    protected void addWindows() {
        System.out.println("Adding Windows");
    }

    /**
     * Adds accessories as defined by the subclass
     */
    protected abstract void addAccessories();

    /**
     * Displays all of the Accessories that the car has
     */
    protected void displayAccessories() {
        System.out.println("Accessories:");
        for (int i = 0; i < accessories.size(); i++) {
            System.out.println(" - " + accessories.get(i));
        }
    }

}
