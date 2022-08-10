package ui;

import commands.Command;
import commands.Fetch;
import commands.Put;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    private final Map<String, Command> commands;
    private final Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.commands = new HashMap<>();
        this.scanner = scanner;
    }

    public void start() {
        // initialize commands
        this.commands.put("put", new Put());
        this.commands.put("fetch", new Fetch());

        boolean quit = false;
        while (!quit) {

            System.out.print("> ");
            String input = this.scanner.nextLine();

            // trim leading/trailing whitespace, replace multiple spaces between
            // words with single space, and split words into array of args
            String[] args = input.trim().replaceAll("\\s{2,}", " ").split(" ");

            String command = args[0].toLowerCase();

            if (this.commands.containsKey(command)) {

                this.commands.get(command).execute(args);

            } else if (command.equals("exit")) {
                System.out.println("Bye!");
                quit = true;
            } else if (command.isBlank()) {
                // do nothing
            } else {
                System.out.println("Unknown command. Known commands are: put, fetch, exit.");
            }
        }
    }
}
