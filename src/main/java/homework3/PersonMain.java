package homework3;

import java.util.*;


public class PersonMain {

    public static void main(String... Args) {
        Set<Person> persons = new TreeSet<>(new AgeComparator());
        Set<Person> personsbyname = new TreeSet<>(new NameComparator());
        Address address1 = new Address("Romania", "Cluj", "Primaverii", 65);
        Address address2 = new Address("UK", "London", "Champaqne", 114);
        Address address3 = new Address("USA", "Los Angeles", "9 Street", 67);
        Address address4 = new Address("Swiss", "Geneva", "10'th Street", 887);

        Hobby hobby1 = new Hobby("cycling", Frequency.FPW);
        Hobby hobby2 = new Hobby("climbing", Frequency.IPW);
        Hobby hobby3 = new Hobby("riding", Frequency.IIIPW);
        Hobby hobby4 = new Hobby("raceing", Frequency.IIPW);

        hobby1.addAddress(address1);
        hobby1.addAddress(address2);
        hobby1.addAddress(address3);
        hobby2.addAddress(address4);
        hobby2.addAddress(address2);
        hobby3.addAddress(address1);
        hobby3.addAddress(address4);
        hobby4.addAddress(address3);

        System.out.println(hobby1.getAddress());
        Employee person1 = new Employee("Paul Doe", 43, address1, "Energie");
        Employee person2 = new Employee("Felicity Terrence", 56, address2, "Telecom");
        Student person3 = new Student("John Doe", 21, address1, "UBB");
        Student person4 = new Student("Maty Drumm", 65, address3, "FSEGA");


        persons.add(person3);
        persons.add(person4);
        persons.add(person1);
        persons.add(person2);
        System.out.println("Sorted by Age :");
        for (Person person : persons) {
            System.out.println(person);
        }
        personsbyname.addAll(persons);

        System.out.println("\nSorted by name :");
        for (Person person : personsbyname) {
            System.out.println(person);
        }

        List<Hobby> person1Hobbies = new ArrayList<>();
        person1Hobbies.add(hobby1);
        person1Hobbies.add(hobby2);
        person1Hobbies.add(hobby4);

        List<Hobby> person2Hobbies = new ArrayList<>();
        person2Hobbies.add(hobby3);
        person2Hobbies.add(hobby2);

        List<Hobby> person3Hobbies = new ArrayList<>();
        person3Hobbies.add(hobby2);
        person3Hobbies.add(hobby4);

        HashMap<Person, List> personsMap = new HashMap<Person, List>();
        personsMap.put(person1, person1Hobbies);
        personsMap.put(person2, person2Hobbies);
        personsMap.put(person3, person3Hobbies);


        System.out.println("Hobbies for person1: " + personsMap.get(person1));


    }
}
