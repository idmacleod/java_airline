public enum PlaneType {
    BOEING747(400, 20000.00),
    AIRBUS220(120, 5000.00),
    CESSNA172(4, 100.00);

    private int capacity;
    private double totalWeight;

    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }
}
