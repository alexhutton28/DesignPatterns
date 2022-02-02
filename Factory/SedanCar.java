public class SedanCar extends Car {
    /**
     * Creates a sedan car, subclass of car
     * 
     * @param make  the maike of the car
     * @param model the model of the car
     */
    public SedanCar(String make, String model) {
        super(make, model);
        this.make = make;
        this.model = model;
    }

    /**
     * Adds the three part frame
     */
    protected void addFrame() {
        System.out.println("Adding a three part frame");
    }

    /**
     * Adds the accessories that are required for a sedan car
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }
}
