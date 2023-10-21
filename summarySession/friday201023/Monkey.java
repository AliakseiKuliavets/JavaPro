package summarySession.friday201023;


public class Monkey {
    private final String name;
    private final int age;
    private final String colour;
    private final boolean isHungry;
    private final double weight;

    public Monkey(String name, int age, String colour, boolean isHungry, double weight) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.isHungry = isHungry;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", isHungry=" + isHungry +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public double getWeight() {
        return weight;
    }

    public int compareTo(Monkey another) {
        int result = this.name.compareTo(another.name); // name
        if (result != 0) return result;

        result = this.age - another.age; // age
        if (result != 0) return result;

        result = this.colour.compareTo(another.colour); // colour
        if (result != 0) return result;

        result = (this.isHungry ? 1 : 0) - (another.isHungry ? 1 : 0); // isHungry
        return result;
    }
}
