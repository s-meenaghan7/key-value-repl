package commands;

import storage.Storage;

public class Fetch implements Command {

    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid syntax");
            return;
        }

        String key = args[1];
        String result = Storage.getValues().get(key);

        System.out.println((result == null) ? "Value not found." : result);
    }

}
