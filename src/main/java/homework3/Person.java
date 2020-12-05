package homework3;


import java.util.*;

public class Person implements IPerson {
    private String name;
    private Integer age;
    private Address address;
    private List<Hobby> hobby = new ArrayList<>();

    public Person(String name, Integer age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, Integer age, Address address, List<Hobby> hobby) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.hobby = hobby;


    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAdress() {
        return address;
    }

    public List<Hobby> getHobby() {
        return hobby;
    }

    public void setHobby(List<Hobby> hobby) {
        this.hobby = hobby;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + ", age=" + age + '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }


        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;

        return name == person.name &&
                Objects.equals(age, person.age) &&
                Objects.equals(address, person.address) &&
                Objects.equals(hobby, person.hobby);
    }

    @Override
    public int hashCode() {
        Random random = new Random();
        random.nextInt(); // -10 -> 10
        return Objects.hash(name, age, address, hobby);

    }


}
