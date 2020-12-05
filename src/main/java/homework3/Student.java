package homework3;


import java.util.List;

public class Student extends Person {

    private String universityName;

    public Student(String name, int age, Address address, String universityName) {
        super(name, age, address);
        this.universityName = universityName;

    }

    public Student(String name, Integer age, Address address, List<Hobby> hobby, String universityName) {
        super(name, age, address, hobby);
        this.universityName = universityName;
    }
}
