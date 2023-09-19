package homeWork._13_09_23;

import lombok.Getter;

import java.util.Objects;
@Getter
public class House {
    private final int flor;
    private final int numberHouse;
    private final String city;

    public House(int flor, int numberHouse, String city) {
        this.flor = flor;
        this.numberHouse = numberHouse;
        this.city = city;
    }

    @Override
    public String toString() {
        return "House{" +
                "flor=" + flor +
                ", numberHouse=" + numberHouse +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return flor == house.flor && numberHouse == house.numberHouse && Objects.equals(city, house.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flor, numberHouse, city);
    }
}
