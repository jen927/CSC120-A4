import java.util.ArrayList;

public class Car {

    ArrayList<Passenger> passengers;
    int maxPassengers;
    String Passenger;

    public Car(int maxPassengers) {
        this.passengers = new ArrayList<Passenger>(maxPassengers);
        this.maxPassengers = maxPassengers;
    }

    /**
     * Getter for the max num of passengers in a car
     * 
     * @return max num
     */
    private int getCapacity() {
        return maxPassengers;
    }

    /**
     * Getter for num of seats remaining in car
     * 
     * @return num of seats remaining
     */
    public int seatsRemaining() {
        return getCapacity() - passengers.size();
    }

    /**
     * adds a passenger to car
     * 
     * @param Passenger
     * @return T/F: was passenger added successfully to car
     */
    public boolean addPassenger(Passenger p) {
        if (passengers.size() < getCapacity() && passengers.contains(p) == false) {
            passengers.add(p);
            return true;
        } else {
            return false;
        }
    }

    /**
     * removes passenger to a car
     * 
     * @param Passenger
     * @return T/F: was passenger removed successfully
     */
    public boolean removePassenger(Passenger p) {
        if (passengers.contains(p)) {
            passengers.remove(p);
            return true;
        } else {
            return passengers.contains(p);
        }
    }

    /**
     * Prints all the passengers' names in car
     */
    public void printManifest() {
        if (passengers.size() > 0) {
            for (Passenger P : passengers) {
                String name = P.getName();
                System.out.println(name);
            }
        } else {
            System.out.println("This car is EMPTY.");
        }
    }

    public static void main(String[] args) {
        Car c = new Car(3);
        // System.out.println(c.getCapacity());
        Passenger passOne = new Passenger("Jen");
        System.out.println(c.addPassenger(passOne));
        c.printManifest();
        System.out.println(c.seatsRemaining());
    }

}