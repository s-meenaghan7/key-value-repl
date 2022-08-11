package commands;

import storage.Storage;

public class Remove implements Command {

    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid syntax");
            return;
        }

        String key = args[1];
        String result = Storage.getValues().remove(key);

        System.out.println((result != null) ? "ok" : "No such value '" + key + "'");
    }
}
