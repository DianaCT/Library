package homework3;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private Frequency frequency;
    private List<Address> address = new ArrayList<>();

    public Hobby(String name, Frequency frequency, List<Address> address) {
        this.name = name;
        this.frequency = frequency;
        this.address = address;

    }

    public Hobby(String name, Frequency frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public void addAddress(Address newAddress) {
        address.add(newAddress);
    }


    @Override
    public String toString() {
        return "\n\t" + "{" + "id='" + name + '\'' + ", frequency=" + frequency + '\'' + ", address='" + address + '}';
    }
}
