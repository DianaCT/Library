package Support;

import java.util.Scanner;

public class ReadFromConsole {
    public int citesteint ( ){
        Scanner citeste = new Scanner(System.in);
        return citeste.nextInt();

    }
    public String citesteString (){
        Scanner citeste = new Scanner(System.in);
        return citeste.nextLine();
    }
}


