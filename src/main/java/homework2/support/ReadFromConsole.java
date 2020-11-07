package homework2.support;

import java.util.Scanner;

public class ReadFromConsole {
    public int readint() {
        Scanner read = new Scanner(System.in);
        return read.nextInt();

    }

    public String readString() {
        Scanner read = new Scanner(System.in);
        return read.nextLine();
    }
}