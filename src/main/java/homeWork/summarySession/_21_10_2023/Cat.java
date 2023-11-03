package homeWork.summarySession._21_10_2023;

public class Cat {
    private String name;
    private boolean hungry;

    public Cat(String name, boolean hungry) {
        this.name = name;
        this.hungry = hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isHungry() {
        return hungry;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", hungry=" + hungry +
                '}';
    }
}
