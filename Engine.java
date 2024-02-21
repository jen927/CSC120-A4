public class Engine {
    //attributes
    FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;

    //constructor
    public Engine(FuelType F, double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
        maxFuelLevel = 100.0;
    }

    // refuel method
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

    // go method
    public boolean go() {
        while (currentFuelLevel > 0) {
            currentFuelLevel -= 10;
            System.out.println(currentFuelLevel);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}