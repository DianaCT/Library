package homework3;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {


    @Override
    public int compare(Person age1, Person age2) {
        if (age1.getAge() < age2.getAge())
            return -1;
        else if (age1.getAge() > age2.getAge())
            return 1;
        else
            return 0;

    }
}
