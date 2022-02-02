public class SmallCar extends Car {
    /**
     * 
     * A subclass of Car, Small Car
     * 
     * @param make  the given make of the car
     * @param model the given model of the car
     */
    public SmallCar(String make, String model) {
        super(make, model);
        this.make = make;
        this.model = model;
    }

    /**
     * Adds a small frame for a small car
     */
    protected void addFrame() {
        System.out.println("Adding a small frame");
    }

    /**
     * Adds the Accessories to the small car from the Accessories enum
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
    }
}
