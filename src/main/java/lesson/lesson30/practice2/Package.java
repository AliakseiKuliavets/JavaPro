package lesson.lesson30.practice2;

public class Package {
    private final String addressOfDeparture;
    private final String addressOfArrive;

    public Package(String addressOfDeparture, String addressOfArrive) {
        this.addressOfDeparture = addressOfDeparture;
        this.addressOfArrive = addressOfArrive;
    }

    public String getAddressOfArrive() {
        return addressOfArrive;
    }

    @Override
    public String toString() {
        return "Package: " + addressOfDeparture + " -> " + addressOfArrive;
    }
}
