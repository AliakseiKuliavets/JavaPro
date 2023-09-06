package lesson.lesson4.practice;

import lombok.Getter;

@Getter
public class House implements Comparable<House> {
    private final int numberHouse;
    private final double areaHouse;
    private final double priceHouse;
    private final String city;

    public House(int numberHouse, double areaHouse, double priceHouse, String city) {
        this.numberHouse = numberHouse;
        this.areaHouse = areaHouse;
        this.priceHouse = priceHouse;
        this.city = city;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberHouse=" + numberHouse +
                ", areaHouse=" + areaHouse +
                ", priceHouse=" + priceHouse +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(House o) {
//        return (int) (this.areaHouse - o.areaHouse);
//        return Integer.compare((int) this.areaHouse ,(int) o.areaHouse);
//        return this.city.compareTo(o.city);

        int i = Integer.compare(this.numberHouse, o.numberHouse);
        if (i != 0) return i;
        i = Integer.compare((int) this.areaHouse, (int) o.areaHouse);
        if (i != 0) return i;
        return this.city.compareTo(o.getCity());

//        if (this.numberHouse == o.numberHouse) {
//            return Integer.compare((int) this.areaHouse, (int) o.areaHouse);
//            }
//        if (this.areaHouse != o.areaHouse) {
//            return this.numberHouse - o.numberHouse;
//        } else {
//            return this.city.compareTo(o.city);
//        }
    }
}
