package storage;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Storage {

    private static final String FILENAME = "key_values.txt";
    private static final Map<String, String> values = new HashMap<>();

    public static Map<String, String> getValues() {
        return values;
    }

    public static void initLocalStorage() throws IOException {
        FileWriter fw = new FileWriter(FILENAME, true);
        readFromFile();
    }

    private static void readFromFile() throws FileNotFoundException {
        Scanner reader = new Scanner(new BufferedReader(new FileReader(FILENAME)));

        while (reader.hasNextLine()) {
            String[] keyValue = reader.nextLine().split(" ");
            values.put(keyValue[0], keyValue[1]);
        }

        reader.close();
    }

    public static void saveToFile() throws IOException {
        // erase all data from the text file first
        clearData();

        // loop through the map and write the key values into the text file
        FileWriter writer = new FileWriter(FILENAME, true);

        values.forEach((key, value) -> {
            try {
                writer.write(key + " " + value + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        writer.close();
    }

    private static void clearData() throws FileNotFoundException {
        new PrintWriter(FILENAME).close();
    }

}
