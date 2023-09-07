package homeWork._07_09_223.taski.Persons;

import lombok.Getter;

@Getter
public abstract class Person {
    private final String namePerson;
    private final int agePeron;

    protected abstract String getDescription();

    public Person(String namePerson, int agePeron) {
        this.namePerson = namePerson;
        this.agePeron = agePeron;
    }
}
