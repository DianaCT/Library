package homework2.phone_ap;

import java.util.ArrayList;
import java.util.List;

import static homework2.support.SupportClass.MESSAGE_LENGHT;

public class SamsungGalaxyNote extends Samsung{

    //private int answer;
    //public static ArrayList< Integer > messageList;
    public static ArrayList<Integer> messageList = new ArrayList<>();

    public SamsungGalaxyNote(){

    }

    public SamsungGalaxyNote( String color, String material){
        super("SamsungGalaxyNote", color, material);
        //super.setName("SamsungGalaxyNote");
        //super.setColor(color);
        //super.setMaterial(material);
    }

    public ArrayList< Integer > getMessageList () {
        return messageList;
    }

    @Override
    public void sendMessage( int numberIn, String message) {
       int  telefonNumber = 0;
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getNr() == numberIn) {
                telefonNumber = contact.getTelnumber();
            }
        }
        if (message.length() > MESSAGE_LENGHT) {
            System.out.println("Message not sent, more that: " + MESSAGE_LENGHT + " characters");
        }else {
            System.out.println("Message sent to" + telefonNumber );
            messageList.add(telefonNumber);

        }


    }


    @Override
    public void MessageHistory() {

            if (getMessageList().isEmpty()) {
                System.out.println("no message today");

            } else {
                System.out.println("Message history:");
                for (int i = 0; i < getMessageList().size(); i++) {
                    System.out.print(getMessageList().get(i) + ",");
                    System.out.println();
                }
            }


    }


}
