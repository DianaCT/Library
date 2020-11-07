package homework2.phone_ap;

import homework2.support.SupportClass;

public abstract class Samsung extends Phone {

    private String name;

    int battery = SupportClass.BATERYLIFE_SAMSUNG;

    public Samsung() {

    }

    public Samsung(String name, String color, String material) {
        super(color, material);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }


    public void batteryLife() {
        int h = (callHistory.size() * 2) + SamsungGalaxyNote.messageList.size();
        battery = battery - h;
        System.out.println("you have :" + battery + "hours");

    }

    public abstract void sendMessage(int number, String message);

    public abstract void MessageHistory();


}
