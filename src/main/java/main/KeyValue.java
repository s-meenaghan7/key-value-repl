package main;

import storage.Storage;
import ui.UserInterface;

import java.io.IOException;
import java.util.Scanner;

public class KeyValue {

    public static void main(String[] args) throws IOException {

        Storage.initLocalStorage();
        UserInterface ui = new UserInterface(new Scanner(System.in));
        ui.start();
        Storage.save();

    }
}
