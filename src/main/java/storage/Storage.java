package storage;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private static final Map<String, String> values = new HashMap<>();

    public static Map<String, String> getValues() {
        return values;
    }
}
