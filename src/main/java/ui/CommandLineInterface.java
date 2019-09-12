package ui;

import java.util.Scanner;
public class CommandLineInterface implements UserInterface {


    @Override
    public void show(String message) {
        MessageLogger.logMessage(message);
    }

    @Override
    public Character getUserInputs() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}
