package homework2.phone_ap;

import homework1_Library_Catalog.book_type.Book;
import homework2.support.ReadFromConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Phone extends Contact implements InPhoneOperations {

    private String color;
    private String material;
    public ArrayList< Contact > contacts;
    public ArrayList<Integer> callHistory = new ArrayList<>();

    public Phone(){

    }

    public Phone(String color, String material) {
        this.color = color;
        this.material = material;
        this.contacts = new ArrayList < Contact > ();

    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String newMaterial) {
        material = newMaterial;
    }

    public ArrayList < Contact > getContacts() {
        return contacts;
    }
    public List < Integer > getCollHistory() {
        return callHistory;
    }

    ReadFromConsole read = new ReadFromConsole();
    int number = 0;


    @Override
    public void addContact() {
        int x = 0;
        if(getContacts().isEmpty()){
            x = 1;
            System.out.println(x);
        }
        else {
            x = contacts.size() + 1;
            System.out.println(x);
        }
        System.out.println("Enter the number of Contacts");
        int count = read.readint();
        for (int i = 0; i < count; i++) {
            System.out.println("Enter number");
            int phoneNumber = read.readint();
            System.out.println("Enter Name");
            //read.readString();
            String name = read.readString();
            Contact newcontact = new Contact(x+i , name, phoneNumber);
            contacts.add(newcontact);
        }
    }



    @Override
    public void listContacts() {
        if(getContacts().isEmpty()){
            System.out.println("Empty contact list");

        }
        else {
            System.out.println("Contact list");
            for (int i = 0; i < getContacts().size(); i++) {
                System.out.println(getContacts().get(i).getNr() +", "+ getContacts().get(i).getName() + ", " + getContacts().get(i).getTelnumber());
            }
        }
    }

    @Override
    public void call( int refnr) {
        int telefonNumber = 0;
        if ( refnr > contacts.size()) {
            System.out.println("Wrong index");
        }else {
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = this.contacts.get(i);
                if (contact.getNr() == refnr) {
                    telefonNumber = contact.getTelnumber();
                    System.out.println("Colling..." + telefonNumber);
                    callHistory.add(telefonNumber);
                }
            }

        }

    }

    @Override
    public void callHistory() {
        if (getCollHistory().isEmpty()) {
            System.out.println("no call today");

        } else {
            System.out.println("Call history:");
            for (int i = 0; i < getCollHistory().size(); i++) {
                System.out.print(getCollHistory().get(i) + ",");
                System.out.println();

            }
        }
    }
}
