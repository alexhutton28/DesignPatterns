public class CarFactory {

    /**
     * A Car factory that will assemble and return a car.
     */
    public CarFactory() {
    }

    /**
     * Creates a Car based on the given type make and model
     * 
     * @param type  the type of car, compared to the car type enum
     * @param make  the given make of car
     * @param model the given model of car
     * @return the created car
     */
    public static Car createCar(String type, String make, String model) {
        Car car;

        if (type.equals(CarType.SMALL.toString().toLowerCase())) {
            car = new SmallCar(make, model);
        } else if (type.equals(CarType.SEDAN.toString().toLowerCase())) {
            car = new SedanCar(make, model);
        } else if (type.equals(CarType.LUXURY.toString().toLowerCase())) {
            car = new LuxuryCar(make, model);
        } else {
            car = new SmallCar(make, model);
        }
        car.assemble();
        return car;
    }

}
