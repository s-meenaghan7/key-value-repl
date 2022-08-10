package main;

import ui.UserInterface;

import java.util.Scanner;

public class KeyValue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(scanner);
        ui.start();

    }
}
