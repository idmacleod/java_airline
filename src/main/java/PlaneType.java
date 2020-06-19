public enum PlaneType {
    BOEING747(400, 16000),
    AIRBUS220(120, 4000),
    CESSNA172(4, 60);

    private int capacity;
    private int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getTotalWeight() {
        return this.totalWeight;
    }
}
