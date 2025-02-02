package DZ32;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("-> ");
            treeSet.add(scan.nextInt());
        }
        System.out.println("Наименьший элемент в TreeSet: " + treeSet.first());
        System.out.println(treeSet);
    }
}
