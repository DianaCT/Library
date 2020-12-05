package homework3;


import java.util.List;

public class Employee extends Person {

    private String companyName;

    public Employee(String name, int age, Address address, String companyName) {
        super(name, age, address);
        this.companyName = companyName;
    }


    public Employee(String name, Integer age, Address address, String companyName, List<Hobby> hobby) {
        super(name, age, address, hobby);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }


}
