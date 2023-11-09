package lesson.lesson22.practice;

import java.util.Objects;

public class Product {

    private int id;
    private String article;
    private boolean isActive;
    private String name;
    private double price;
    private String supplier;

    public Product(String name, double price, String supplier) {
        this.isActive = true;
        this.name = name;
        this.price = price;
        this.supplier = supplier;
    }

    void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && isActive == product.isActive && Double.compare(product.price, price) == 0 && Objects.equals(article, product.article) && Objects.equals(name, product.name) && Objects.equals(supplier, product.supplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, article, isActive, name, price, supplier);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", article='" + article + '\'' +
                ", isActive=" + isActive +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}