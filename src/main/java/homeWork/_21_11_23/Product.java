package homeWork._21_11_23;

public class Product {
    private int id;
    private String Name;
    private double weight;

    public Product(String name, double weight) {
        if (name == null || weight == 0) {
            throw new IllegalArgumentException("Нельзя создавать товары без Имени или Веса");
        }
        ++id;
        Name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
