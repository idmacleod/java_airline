public class Passenger {
    private String name;
    private int bags;

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

    public double getBaggageWeight() {
        // Assume all bags weight 15kg
        return 15.00 * bags;
    }
}
