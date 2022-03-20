public enum PlaneType {
    AIRBUS_A220(116, 60000),
    AIRBUS_A350(325, 280000),
    BOEING_737(200, 80000),
    BOEING_747(410, 448000),
    PRIVATE_JET(3, 50000);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
