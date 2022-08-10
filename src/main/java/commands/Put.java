package commands;

import storage.Storage;

public class Put implements Command {

    @Override
    public void execute(String[] args) {
        if (args.length != 3) {
            System.out.println("Invalid syntax");
            return;
        }

        String key = args[1];
        String value = args[2];

        Storage.getValues().put(key, value);

        System.out.println("ok");
    }

}
