package summarySession.friday161123.framework.interfaces;

import java.util.List;

public interface AppDataBase<T> {
    List<T> getAll();

    T getById(int id);

    T add(int age, String name);

    void delete(int id);
}
