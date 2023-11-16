package summarySession.friday161123.aplication.services;

import summarySession.friday161123.aplication.animals.Cat;
import summarySession.friday161123.aplication.dataBases.CatDataBase;
import summarySession.friday161123.framework.annotations.AutoSet;
import summarySession.friday161123.framework.annotations.Service;
import summarySession.friday161123.framework.interfaces.AppService;

@Service
public class CatService implements AppService {
    @AutoSet
    private CatDataBase catDataBase;

    @Override
    public void printAll() {
        for (Cat cat : catDataBase.getAll()) {
            System.out.print(cat);
        }
    }

    @Override
    public void printOne(int id) {
        System.out.println(catDataBase.getById(id));
    }
}
