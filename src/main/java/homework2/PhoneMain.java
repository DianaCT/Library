package homework2;


import homework2.phone_ap.*;
import homework2.support.ReadFromConsole;

public class PhoneMain {
    public static void main(String... args) {

        SamsungGalaxyNote phone1 = new SamsungGalaxyNote("red", "metal");
        SamsungGalaxyA71 phone2 = new SamsungGalaxyA71("black", "plastic");
        HTCOne phone3 = new HTCOne("yellow", "aluminium", "Android");
        HTCOnePlus phone4 = new HTCOnePlus("pink", "metal", "iOS");
        System.out.println(phone1.getName());

        Integer answer;
        ReadFromConsole read = new ReadFromConsole();
        boolean quit = false;

        while (!quit) {
            System.out.println("For menu press 0, for exit press 8");
            answer = read.readint();

            switch (answer) {
                case 0:
                    System.out.println("press 0 to see the instructions again");
                    System.out.println("Press 1 for adding contact");
                    System.out.println("Press 2 for viewing the contact list");
                    System.out.println("Press 3 to make a call");
                    System.out.println("Press 4 to see call history");
                    System.out.println("Press 5 to send a message");
                    System.out.println("Press 6 to see message history");
                    System.out.println("Press 7 for battery status");
                    System.out.println("Press 8 for exiting");
                    break;

                case 1:
                    phone1.addContact();
                    break;

                case 2:
                    phone1.listContacts();
                    break;

                case 3:
                    System.out.println("Enter the index of contact");
                    int refnr = read.readint();
                    phone1.call( refnr);
                    break;

                case 4:
                    phone1.callHistory();
                    break;

                case 5:
                    System.out.println("Enter the index of contact");
                    int  number = read.readint();
                    System.out.println("text messaje: ");
                    String text = read.readString();
                    phone1.sendMessage(number,text);
                    break;

                case 6:
                    phone1.MessageHistory();
                    break;

                case 7:
                    phone1.batteryLife();
                    break;

                case 8:
                    quit = true;
                    break;
            }
        }

    }
}
