public class LuxuryCar extends Car {
    /**
     * creates a subclass of car that contains its own engine and all of the
     * accessories
     * 
     * @param make  the make of the car
     * @param model the model of the car
     */
    public LuxuryCar(String make, String model) {
        super(make, model);
        this.make = make;
        this.model = model;
    }

    /**
     * adds the beautifil frame to the car
     */
    protected void addFrame() {
        System.out.println("Adding a beautiful frame");
    }

    /**
     * Overrides the original engine and adds a supped up engine
     */
    protected void addEngine() {
        System.out.println("Adding a Supped Up Engine");
    }

    /**
     * adds all of the accessories
     */
    protected void addAccessories() {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
        accessories.add(Accessories.SPORT_SEATS);
        accessories.add(Accessories.WINDOW_TINT);
        accessories.add(Accessories.HIGH_END_SOUND);
        accessories.add(Accessories.TRUNK_ORGANIZER);
        accessories.add(Accessories.BLUE_TOOTH);
    }
}
