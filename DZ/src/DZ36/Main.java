package DZ36;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {6, 8, 6, 7, 3};
        int[] array2 = {2, 5, 8, 7, 3};
        System.out.println("Результат: " + arrayNumber(array1, array2));
    }

    public static Set arrayNumber(int[] array1, int[] array2) {
        Set<Integer> arraySet1 = new HashSet<>();
        Set<Integer> arraySet2 = new HashSet<>();
        Set<Integer> arraySet3 = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            arraySet1.add(array1[i]);
            arraySet3.add(array1[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            arraySet2.add(array2[i]);
        }
        arraySet3.retainAll(arraySet2);
        arraySet1.removeAll(arraySet3);
        arraySet2.removeAll(arraySet3);
        arraySet1.addAll(arraySet2);
        return arraySet1;
    }
}
