import java.util.ArrayList;

public class Car {
    // attributes
    ArrayList passengers;
    int maxPassengers;

    //constuctor
    //  a constructor, which takes in an initial value
    //  for the `Car`'s maximum capacity and
    //  initializes an appropriately-sized `ArrayList`
    public Car(int maxPassengers) {
        ArrayList<String> passengers = new ArrayList<String>();
        this.maxPassengers = maxPassengers;
    }
    // accessor-like methods `public int getCapacity()`
    // and `public int seatsRemaining()`
    // that return the maximum capacity and
    // remaining seats, respectively
    public int getCapacity() {
        return maxPassengers;
    }

    public int seatsRemaining() {
        return maxPassengers - passengers.size();
    }

    

}