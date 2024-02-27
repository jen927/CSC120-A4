import java.util.ArrayList;

public class Car {
    // attributes
    ArrayList<Passenger> passengers;
    int maxPassengers;
    String Passenger;

    //constuctor
    public Car(int maxPassengers) {
        ArrayList<Passenger> passengers = new ArrayList<Passenger>(maxPassengers);
        this.passengers = passengers;
    }
    
    public int getCapacity() {
        return maxPassengers;
    }

    public int seatsRemaining() {
        return maxPassengers - passengers.size();
    }

    public boolean addPassenger(Passenger p) {
        if (passengers.size() < maxPassengers)  {
            passengers.add(p);
            return true;
        }
        else {
            return false;
        } 
    }

    public boolean removePassenger(Passenger p) {
        if (passengers.contains(p)) {
            passengers.remove(p);
            return true;
        }
        else {
            return passengers.contains(p);
        }
    }
    public void printManifest() {
        if (passengers.size() > 0) {
            for (Passenger i : passengers) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("This car is EMPTY.");
        }
    }

}