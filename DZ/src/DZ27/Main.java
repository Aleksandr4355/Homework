package DZ27;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов числовго массива: ");
        Integer[] numberArray = new Integer[input.nextInt()];
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("-> ");
            numberArray[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(numberArray));
        Print p1 = new Print<>(numberArray);
        p1.printArray();
        System.out.print("\nВведите количество элементов массива строк: ");
        String[] stringArray = new String[input.nextInt()];
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print("-> ");
            stringArray[i] = input.next();
        }
        Print p2 = new Print<>(stringArray);
        System.out.println(Arrays.toString(stringArray));
        p2.printArray();
    }
}
