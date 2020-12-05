package homework3;

import java.util.Comparator;

import homework3.Person;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person name1, Person name2) {
        return name1.getName().compareTo(name2.getName());
    }
}