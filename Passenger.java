public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public boolean boardCar(Car c) {
        return c.addPassenger(this);
    }

    public boolean getOffCar(Car c) {
        return c.removePassenger(this);
    }
}
