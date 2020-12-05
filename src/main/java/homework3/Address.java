package homework3;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private String country;
    private String townName;
    private String street;
    private int streetNumber;
    private List<Address> address;

    public Address(String country, String townName, String street, int streetNumber) {
        this.country = country;
        this.townName = townName;
        this.street = street;
        this.streetNumber = streetNumber;
        this.address = new ArrayList<>();

    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return ("\n\t " + "country='" + country + '\'' + ", address=" + townName);
    }
}
