package lesson.lesson21.practice;

public enum Degree {

    BACHELOR("Бакалавр"),
    MASTER("Магистр");

    private String description;

    Degree(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}