public class Passenger {
    private String name;
    private int bags;
    private Flight flight;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public Flight getFlight() {
        return flight;
    }
}
