package service.imple;

import db.Database;
import model.Gender;
import model.Person;
import service.GenericService;

import java.util.List;

public class PersonServiceImpl<T> implements GenericService {
    Database database = new Database();

    @Override
    public String add(List t) {
        database.setPeople(t);
        return "Successful add";
    }

    @Override
    public Person getById(Long id) {
        for (Person s : database.getPeople()) {
            if (s.getId() == id) {
                System.out.println(s);
            }
        }
        return "find Person";
    }


    @Override
    public String removeByName(String name) {
        for (Person s : database.getPeople()) {
            if (name == s.getId()) {
                database.getPeople().remove(s);
                System.out.println(database);
            }
        }

        @Override
        public List getAll () {
            return database.getPeople();
        }

        @Override
        public List sortByName () {
            for (Person n : database.getPeople()) {

            }
        }
    }

    @Override
    public List filterByGender() {
        for (Person p : database.getPeople()) {
            if (p.getGender().equals(Gender.MALE)) {
                database.getPeople(p);
            }
        }
         database.getPeople().forEach(System.out::println);
        return database.getPeople();

}

    @Override
    public List clear() {
        database.getPeople().clear();
        return database.getPeople();
    }
}
