package DZ34;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Key, Integer> hashMap = new HashMap<>();
        ArrayList<Key> keys = new ArrayList<>(Arrays.asList(new Key("X"),new Key("Y"),new Key("Z")));
        HashMap<Integer, Key> hashMapResult = new HashMap<>();
        for (int i = 0, j = 1; i < keys.size(); i++, j++) {
            hashMap.put(keys.get(i),j);
        }
        System.out.println("Исходный Map: " + hashMap);
        for (int i = 0, j = 1; i < keys.size(); i++, j++) {
            hashMapResult.put(j, keys.get(i));
        }
        System.out.println("Измененный Map: " + hashMapResult);
    }
}
class Key{
   final private String name;


    Key(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }

}