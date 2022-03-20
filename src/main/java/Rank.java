public enum Rank {
    CAPTAIN(1),
    FIRST_OFFICER(2),
    CHIEF_FLIGHT_ATTENDANT(3),
    FLIGHT_ATTENDANT(4);

    private final int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
