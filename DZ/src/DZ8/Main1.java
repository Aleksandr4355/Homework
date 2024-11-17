package DZ8;

import java.lang.foreign.SymbolLookup;
import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.print("Ввведите начало: ");
        int k = input.nextInt();
        System.out.print("Ввведите конец: ");
        int n = input.nextInt();
        int [] array = new int[n-k+1];
        for (int i = 0, j = k; i <= n - k; i++, j++) {
            array[i] = j;
            System.out.println(array[i] + "\t");
        }
        System.out.println("\n" + Arrays.toString(array));
    }
}
