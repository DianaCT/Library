package homework3;

public enum Frequency {

    IPW("One per week"),
    IIPW("two times per week"),
    IIIPW("three times per week"),
    FPW("five times per week");

    private final String name;

    Frequency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
