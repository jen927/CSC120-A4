import java.util.ArrayList;

public class Train {
    Engine E;
    ArrayList<Car> Cars;
    private int passengerCapacity;

    //constructor
    // a constructor `Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity)`
    // which will initialize the `Engine` and `Car`s and store them
    Train(FuelType fuelType, double fuelCapacity,
    int nCars, int passengerCapacity) {
        Engine E = new Engine(fuelType,fuelCapacity);
        ArrayList<Car> Cars = new ArrayList<Car>(nCars);
        this.passengerCapacity = passengerCapacity;
        this.Cars = Cars;
        this.E = E;
    }
    public Engine getEngine() {
        return E;
    }
    public Car getCar(int i) { //to return the `i`th car
        return Cars.get(i);
    }
    public int getMaxCapacity() { //which will return the maximum total capacity across all `Car`s
        return passengerCapacity * Cars.size();
    }
    public int seatsRemaining() { // which will return the number of remaining open seats across all `Car`s
        int seats = getMaxCapacity();
        for (Car c: Cars) {
            seats -= c.seatsRemaining();
        }
        return seats;
    }
    private void printManifest() {
        for (Car c : Cars) {
            c.printManifest();
        }
    }

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 5, 3);
        System.out.println(myTrain.seatsRemaining()); //output: 0, not quite right
        //myTrain.printManifest();
    }
}    
