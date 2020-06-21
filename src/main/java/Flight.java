import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String number;
    private String destination;
    private String departAirport;
    private String departTime;

    public Flight(Plane plane, String number, String destination,
                  String departAirport, String departTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.number = number;
        this.destination = destination;
        this.departAirport = departAirport;
        this.departTime = departTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int countPassengers() {
        return passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartAirport() {
        return departAirport;
    }

    public String getDepartTime() {
        return departTime;
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - countPassengers();
    }

    public void bookPassenger(Passenger passenger) {
        if (getAvailableSeats() > 0) {
            passengers.add(passenger);
        }
    }
}