public class Engine {

    FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;

    public Engine(FuelType F, double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
        maxFuelLevel = 100.0;
    }

    /**
     * refills fuel level
     */
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }

    /**
     * Decreases fuel level
     * 
     * @return T/F: is there any fuel left
     */
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