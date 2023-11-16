package summarySession.friday161123.aplication.dataBases;

import summarySession.friday161123.aplication.animals.Cat;
import summarySession.friday161123.framework.annotations.DataBase;
import summarySession.friday161123.framework.interfaces.AppDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@DataBase
public class CatDataBase implements AppDataBase<Cat> {
    private Map<Integer, Cat> cats = new HashMap<>();
    private int currentId = 0;

    public CatDataBase() {
        add(5, "Tom");
        add(3, "Garfield");
        add(2, "Silvestr");
    }

    @Override
    public List<Cat> getAll() {
        return cats.values().stream().toList();
    }

    @Override
    public Cat getById(int id) {
        return cats.get(id);
    }

    @Override
    public Cat add(int age, String name) {
        Cat cat = new Cat(++currentId, age, name);
        cats.put(currentId, cat);
        return cat;
    }

    @Override
    public void delete(int id) {
        cats.remove(id);
    }
}
