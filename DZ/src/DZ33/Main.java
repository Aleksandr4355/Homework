package DZ33;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] arrayColor = new String[]{"red", "orange", "aqua", "pink", "gray", "blue", "white", "black", "yellow", "brown"};
        HashMap<String, Color> mapColor = new HashMap<>();
        for (int i = 0; i < arrayColor.length; i++) {
            mapColor.put(arrayColor[i], new Color(arrayColor[i].toUpperCase()));
        }
        for (Map.Entry s : mapColor.entrySet()) {
            System.out.println(s.getKey() + ": " + s.getValue());
        }
    }
}
