import java.util.ArrayList;

public class Train {
    Engine E;
    ArrayList<Car> cars;
    int passengerCapacity;
    int nCars;

    Train(FuelType fuelType, double fuelCapacity,
            int nCars, int passengerCapacity) {
        this.E = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>(nCars);
        for (int a = 0; a < nCars; a++) {
            cars.add(new Car(passengerCapacity));
        }
        this.passengerCapacity = passengerCapacity;
        this.nCars = nCars;
    }

    /**
     * Getter for Engine
     * 
     * @return Engine
     */
    private Engine getEngine() {
        return E;
    }

    /**
     * Getter for Car
     * 
     * @param index of car in car arraylist
     * @return Car at specified index
     */
    public Car getCar(int i) {
        return cars.get(i);
    }

    /**
     * Getter for the maximum capacity of train
     * 
     * @return the sum of all the cars capacity
     */
    public int getMaxCapacity() {
        return passengerCapacity * nCars;
    }

    /**
     * Getter of value of seat remaining on train
     * 
     * @return the value of seats that remain
     */
    public int seatsRemaining() {
        int seats = 0;
        for (Car c : cars) {
            seats += c.seatsRemaining();
        }
        return seats;
    }

    /**
     * Prints names of all passengers in each car
     */
    private void printManifest() {
        System.err.println("List of Passengers");
        for (int i = 0; i < nCars; i++) {
            System.out.println("Car " + (i + 1));
            cars.get(i).printManifest();
        }
    }

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 5, 3);
        System.out.println(myTrain.getMaxCapacity());
        while (myTrain.getEngine().go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
        System.out.println(myTrain.seatsRemaining());
        Passenger passOne = new Passenger("Jen");
        passOne.boardCar(myTrain.getCar(1));
        System.out.println(myTrain.seatsRemaining());
        passOne.boardCar(myTrain.getCar(1));
        System.out.println(myTrain.seatsRemaining());
        myTrain.printManifest();
    }
}
