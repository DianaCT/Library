package homework2.phone_ap;

public class Contact {
    private String name;
    private int telnumber;
    public int nr;

    public Contact() {

    }

    public Contact( int nr , String name, int telnumber) {

        this.name = name;
        this.nr = nr;
        this.telnumber = telnumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int newNr) {
        nr = newNr;
   }

    public int getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(int newTelnumber) {
        telnumber = newTelnumber;
    }




}
