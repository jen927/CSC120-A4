public class Passenger {

    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    /**
     * adds passenger to a car
     * 
     * @param Car
     * @return T/F: did the passenger successfully board the car
     */
    public boolean boardCar(Car c) {
        return c.addPassenger(this);
    }

    /**
     * removes passenger from a car
     * 
     * @param the specific car
     * @return T/F: was the passenger removed
     */
    public boolean getOffCar(Car c) {
        return c.removePassenger(this);
    }

    /**
     * Getter for name
     * 
     * @return the name of passenger
     */
    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Car A = new Car(3);
        Passenger one = new Passenger("Jen");
        one.boardCar(A);
        System.out.println(one.name);
    }
}
