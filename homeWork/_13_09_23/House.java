package homeWork._13_09_23;

import lombok.Getter;

import java.util.Objects;
@Getter
public class House implements Comparable<House>{
    private final int flors;
    private final int numberHouse;
    private final String city;

    public House(int flor, int numberHouse, String city) {
        this.flors = flor;
        this.numberHouse = numberHouse;
        this.city = city;
    }

    @Override
    public String toString() {
        return "House{" +
                "flors=" + flors +
                ", numberHouse=" + numberHouse +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return flors == house.flors && numberHouse == house.numberHouse && Objects.equals(city, house.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flors, numberHouse, city);
    }

    @Override
    public int compareTo(House o) {
        return o.numberHouse - this.numberHouse; // в порядке убывания
    }
}
