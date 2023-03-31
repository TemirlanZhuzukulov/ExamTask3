package db;

import model.Animal;
import model.Person;

import java.util.ArrayList;
import java.util.List;

public class Database <T>{

    List<Person>people=new ArrayList<>();
    List<Animal>animals=new ArrayList<>();

    public Database() {
    }

    public Database(List<Person> people, List<Animal> animals) {
        this.people = people;
        this.animals = animals;
    }

    public List getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Database{" +
                "people=" + people +
                ", animals=" + animals +
                '}';
    }
}
