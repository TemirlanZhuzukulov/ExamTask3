package service.imple;

import db.Database;
import model.Gender;
import model.Person;
import service.GenericService;

import java.util.Comparator;
import java.util.List;

public class AnimalServiceImpl implements GenericService {
    Database database = new Database<>();

    @Override
    public String add(List t) {
        return t.stream()
                .reduce("", (s) -> s );
    }


    @Override
    public Object getById(Long id) {
        return null;
    }

    @Override
    public String removeByName(String name) {
        database.getPeople().stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .toList()
                .forEach(System.out::println);
        return database.getPeople();

    }

    @Override
    public List getAll() {
      List p =  database.getPeople().stream().toList();
      return p;
    }

    @Override
    public List sortByName() {
        return database.getPeople().stream()
                .sorted(Comparator.comparing(Person::getName))
                .toList();
    }

    @Override
    public List filterByGender() {
        database.getPeople().stream()
                .filter(database -> database.getGender().equals(Gender.MALE))
                .toList()
                .forEach(System.out::println);
    return database.getPeople();
}

    @Override
    public List clear() {

    }
}
